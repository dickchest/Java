package book_ImproveJava;

public class Student {
    String name;

    public Student() {
        this.name = "Marco";
        System.out.println("Robert");
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Emma");
        Student st2 = new Student("Anna");
        Student st3 = new Student();

        st1 = st2;
        st3 = st1;
        st3 = null;
        System.out.println(st1.name);

        st2.name="Dennis";
        System.out.println(st1.name);

    }
}
