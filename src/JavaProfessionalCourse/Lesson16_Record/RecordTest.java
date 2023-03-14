package JavaProfessionalCourse.Lesson16_Record;

public class RecordTest {
    public static void main(String[] args) {
        Key key = new Key(20, "Vasya");
        Key key2 = new Key(20, "Vasya");

        System.out.println(key.age());
        System.out.println(key.name());
        key.test();

        System.out.println(key.equals(key2));
        System.out.println(key.hashCode());
        System.out.println(key);
    }
}
