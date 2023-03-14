package JavaProfessionalCourse.Lesson16_Record;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("str");
//        String str = (String) list.get(0);

        List<String> list = new ArrayList<>();
//        List<?> list = new ArrayList<String>();
        list.add("str");
        list.add("str2");
        String str = list.get(0);
        System.out.println(str);
        List<? super Number> numbers = new ArrayList<Object>(); // Producer extends -> Consumer super
//        List<? extends Number> numbers = new ArrayList<Object>(); // Producer extends -> Consumer super
        numbers.add(1);
        numbers.add(4.0);

        numbers.get(0);


//        List<?> questions = new ArrayList<>();
        List<?> list2 = list;
//        list2.add("");


        for (String s : list) {
            System.out.println(s);
        }

//        System.out.println(notNull(str));  ///super Number
//        System.out.println(notNull(list));
//        System.out.println(notNull(numbers));

    }

    public static <T> boolean notNull(T obj) {
        return obj != null;
    }

}
