package book_ImproveJava._8_Inheritance.quiz3_CallingTheSuperclassConstructor;

public class Book extends Publication {
    String author;

    public Book(String author) {
        super(""); //
        this.author = author;
        System.out.println(author);
    }

    public static void main(String[] args) {
        Book book = new Book("David");
    }
}
