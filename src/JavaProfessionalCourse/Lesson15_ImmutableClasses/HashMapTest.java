package JavaProfessionalCourse.Lesson15_ImmutableClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Key, String> bookNames = new HashMap<>();
        Key oldKey = new Key(3, 7, new ArrayList<>());
        System.out.println(oldKey.hashCode());
        bookNames.put(oldKey, "Master i Margarita");
        oldKey.getLabels().add("incorrectlabel");

//        oldKey.setNumberOfLibrary(4);
        System.out.println(oldKey.hashCode());
        System.out.println(bookNames.get(oldKey));


        Key newKey = new Key(4, 7, new ArrayList<>());
        bookNames.put(newKey, "Master i Margarita");
        System.out.println(bookNames.get(newKey));

    }
}
