package JavaProfessionalCourse.Lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("sec");
        strings.add("test");
        strings.add("third");
        strings.add("forth");
        strings.add("fith");
        strings.add("test");
        strings.add("test2");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println("iterator example: ");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String currentVal = iterator.next();
            System.out.println(currentVal);
            if (currentVal.length() > 4) {
                iterator.remove();
            }
        }

        System.out.println(strings);

        ListIterator<String> iterator1 = strings.listIterator();
        while(iterator1.hasNext()) {
            String currentVal = iterator1.next();
            if (currentVal.length() < 3) {
                iterator1.remove();
                iterator1.add("test-iterator");
            } else {
                iterator1.set("test-iterator 2");
            }
        }
        System.out.println(strings);


        for (String currentElem: strings) {
            System.out.println(currentElem);
        }

        int[] array = new int[10];

        for (int val: array) {
            System.out.println(val);
        }


    }
}
