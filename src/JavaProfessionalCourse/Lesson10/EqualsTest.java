package JavaProfessionalCourse.Lesson10;

public class EqualsTest {
    public static void main(String[] args) {
        String first = "tse";
//        String second = "tse";
        String second = new String("tse").intern();

        Cat cat = new Cat("Barsik");
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = cat;

        System.out.println(cat2 == cat);
        System.out.println(cat3 == cat);

        System.out.println(cat2.equals(cat));
        System.out.println(cat3.equals(cat));

        System.out.println(cat.equals(cat)); // рефлективность
        System.out.println("--------String -----------");
        System.out.println(first == second);


    }
}
