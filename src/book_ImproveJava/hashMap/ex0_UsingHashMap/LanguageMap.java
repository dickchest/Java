package book_ImproveJava.hashMap.ex0_UsingHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LanguageMap {
    static Map<String, String> languageMap = new HashMap<>();

    public static void addDataDisplay() {
        languageMap.put("en", "English");
        languageMap.put("fr", "French");
        languageMap.put("de", "German");
    }

    public static void getDataDisplay() {
        addDataDisplay();
        System.out.println();
        for (Entry<String, String> entry : languageMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        getDataDisplay();
    }
}
