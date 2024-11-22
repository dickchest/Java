package book_ImproveJava.methods;

public class Student_voidMethod  {
    String name;
    int age;

    public void updateData(String name, int age) {
        this.name = name;
        System.out.print(" 1 ");
    }

    public static void main(String[] args) {
        Student_voidMethod st1 = new Student_voidMethod();
        st1.updateData("Jack", 24);
        System.out.println(st1.name + " " + st1.age);
    }
}
