package book_ImproveJava._9_Polymorphism.quiz2_CallingMethodsWithinConstructor;

public class Person {
    String name = "Robert";

    public Person() {
        printName();
    }

    void printName() {
        System.out.println(name);
    }
}
