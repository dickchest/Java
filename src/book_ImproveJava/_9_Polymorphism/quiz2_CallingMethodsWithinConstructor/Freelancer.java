package book_ImproveJava._9_Polymorphism.quiz2_CallingMethodsWithinConstructor;

public class Freelancer extends Person {
    static String name = "Emma"; // if remove static - result is null

    @Override
    void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Freelancer freelancer = new Freelancer();
    }
}
