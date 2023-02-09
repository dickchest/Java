package JavaProfessionalCourse.Lesson8LinkedList.RepeatHomeWork7.List;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        List<Integer> values = new MyList();
        values.add(8);
        values.add(5);
        System.out.println(values.size());
        System.out.println(values.get(0));
        System.out.println(values.get(1));

        values.add(1,6);
        System.out.println(values.get(0));
        System.out.println(values.get(1));




    }
}
