package JavaProfessionalCourseHomeWork.HomeWork23.Level2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
посчитайте сколько раз каждая символ встречался в файле (используйте Map для хранения
промежуточного результата), финальный результат запишите в файл
 */
public class Exercise5 {
    public static void main(String[] args) {
        File inputFile = new File("data/matches.txt");
        File outputFile = new File("data/tmp/outExercise5.txt");
        Map<Character, Integer> characterCount = new HashMap<>();

        // считываем в файл и заполняем мапу с количеством каждого символа
        try (Reader reader = new BufferedReader(new FileReader(inputFile))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                if (characterCount.containsKey(character)) {
                    characterCount.put(character,characterCount.get(character)+1);
                } else {
                    characterCount.put(character, 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // выводим результаты в файл
        try (PrintStream writer = new PrintStream(new FileOutputStream(outputFile))) {
            for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
                writer.println(entry.getKey()+": "+entry.getValue());
//                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
