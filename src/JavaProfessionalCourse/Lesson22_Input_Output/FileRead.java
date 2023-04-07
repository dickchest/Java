package JavaProfessionalCourse.Lesson22_Input_Output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("names.txt");
        Scanner scanner = new Scanner(file);
        // другой способ создания потока из файла
//        System.setIn(new FileInputStream(file));
//        Scanner scanner = new Scanner(System.in);

//        String s = scanner.nextLine();
//        System.out.println(s);

        // переопределение выходящего потока в новый файл
//        File fileOut = new File("namesOut.txt");
//        System.setOut(new PrintStream(fileOut));


        List<MatchResult> results = new ArrayList<>();
        while (scanner.hasNextLine()) {
            results.add(new MatchResult(scanner.nextLine()));
        }

        File fileOut = new File("matchResults.txt");
        PrintStream resultOs = new PrintStream(fileOut);
        resultOs.println(results);
//        System.out.println(results);
        results.stream().map(MatchResult::getWinner).forEach(resultOs::println);
        resultOs.close(); // close stream

//        FileReader fileReader = new FileReader(file);

    }
}
