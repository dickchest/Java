package JavaProfessionalCourseHomeWork.HomeWork23.Level1.Exercise11;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/*
11. Напишите небольшую программу, которая будет работать с логикой игры, для этого создайте класс GameSaveResult(name, winCounter, loseCounter)
    - Программа в самом начале пытается посмотреть предыдущий результат в файле `result.txt`
      - если файла нет, то создает его и создает новый объект GameSaveResult с пустым каунтером и просит пользователя ввести имя с консоли
      - если файл существует, то считывает GameSaveResult из файла
    - дальше с помощью рандома генерируется результат `isWin`:
      - true - выигрыш
      - false - проигрыш
    - увеличивается нужный каунтер и сохраняется в этот же файл
    - запустите программу несколько раз
 */
public class GameSaveResult {
    private String name;
    private int winCounter;
    private int loseCounter;

    public GameSaveResult(String name, int winCounter, int loseCounter) {
        this.name = name;
        this.winCounter = winCounter;
        this.loseCounter = loseCounter;
    }

    public String getName() {
        return name;
    }

    public int getWinCounter() {
        return winCounter;
    }

    public int getLoseCounter() {
        return loseCounter;
    }

    public void increaseWinCounter() {
        winCounter++;
    }

    public void increaseLooseCounter() {
        loseCounter++;
    }

    // =====

    public static void main(String[] args) {
//        - Программа в самом начале пытается посмотреть предыдущий результат в файле `result.txt`
        String fileName = "data/result.txt";
        GameSaveResult gameResult = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();

            if (line != null) {
//                - если файл существует, то считывает GameSaveResult из файла
                String[] data = line.split(",");
                gameResult = new GameSaveResult(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                System.out.println("Loaded game result: " + gameResult.getName()
                + ", wins: " + gameResult.getWinCounter() + ", losses: " + gameResult.getLoseCounter()
                );
            }
        } catch (IOException e) {
            //        - если файла нет, то создает его и создает новый объект GameSaveResult с пустым каунтером и просит пользователя ввести имя с консоли
            gameResult = new GameSaveResult(getPlayerName(), 0, 0);
            System.out.println("Created new game for " + gameResult.getName());
        }
//        - дальше с помощью рандома генерируется результат `isWin`:
//        - true - выигрыш
//                - false - проигрыш
//                - увеличивается нужный каунтер и сохраняется в этот же файл

        Random random = new Random();
        boolean isWin = random.nextBoolean();

        if (isWin) {
            gameResult.increaseWinCounter();
            System.out.println("You won!");
        } else {
            gameResult.increaseLooseCounter();
            System.out.println("You lost!");
        }
        writeFile(fileName, gameResult);
    }

    private static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    private static void writeFile (String fileName, GameSaveResult gameResult) {
        try (
                FileWriter fileWriter = new FileWriter(fileName)
                ) {
            fileWriter.write(gameResult.getName()+"," + gameResult.getWinCounter()+","+gameResult.loseCounter);
            System.out.println("File was recorded");
        } catch (IOException e) {
            System.out.println("Failed to save game result");
            e.printStackTrace();
        }
    }
}
