package book_ImproveJava._9_Polymorphism.ex3b_DowncastingObjects;

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
        Sub mySub = (Sub) mySuper;
        System.out.println("mySuper.display() = " + mySub.display());
        System.out.println("mySuper.age = " + mySub.age);
    }
}
