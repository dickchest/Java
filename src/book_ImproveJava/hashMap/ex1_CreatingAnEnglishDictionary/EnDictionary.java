package book_ImproveJava.hashMap.ex1_CreatingAnEnglishDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnDictionary {
    Map<String, String> words = new HashMap<>();

    public void addWords() {
        words.put("go", "Walk");
        words.put("buy", "Purchase");
        words.put("happy", "Pleased");
        words.put("translate", "Interpret");
        words.put("end", "Finish");
        words.put("exit", "By by");
    }

    public static void main(String[] args) {
        EnDictionary enDictionary = new EnDictionary();
        enDictionary.addWords();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("\nEnter a word:");
            input = scanner.nextLine().toLowerCase();
            String synonymous = enDictionary.words.get(input);
            System.out.println("Synonymous is: " + synonymous);
        } while (!input.equals("exit"));
    }
}
