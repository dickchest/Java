package book_ImproveJava._8_Inheritance.quiz2_SubclassAndSuperclass;

public class Publication {
    protected String title;

    public Publication() {
        System.out.print("PHP ");
    }

    public Publication(String title) {
        this.title = title;
        System.out.print("SQL ");
    }
}
