package book_ImproveJava._9_Polymorphism.ex3a_UpcastingObjects;

public class Sub extends Super {
    int age = 50;

    public String display() {
        return "Sub method";
    }

    /*
    Notice
    By upcasting, the variable depends on the type of the object reference mySuper, while th
    method depends on the type of the created object
     */
    public static void main(String[] args) {
        Super mySuper = new Sub();
        System.out.println("mySuper.display() = " + mySuper.display());
        System.out.println("mySuper.age = " + mySuper.age);
    }
}
