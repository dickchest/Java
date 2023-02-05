package JavaCourse.Lesson5;

public class Main {
    public static void main(String[] args) {
        Person alexey = new Person("Alexey");
        Person victor = new Person("Victor");
        Person yulia = new Person("Yulia");

//        System.out.println(alexey.getName());

        Paper paper = new Paper();
        paper.writeName(alexey.getName());
        paper.writeName(victor.getName());
        paper.writeName(yulia.getName());

        System.out.println(paper.getContent());
    }
}
