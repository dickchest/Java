package book_ImproveJava._8_Inheritance.quiz4_CallingTheSuperclassConstructor;

public class Publication {
    protected String title;

    public Publication() {
        System.out.print("Java ");
    }

    Publication(String myTitle) {
        System.out.print(title);
        System.out.print("Python ");
    }
}
