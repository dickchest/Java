package book_ImproveJava._8_Inheritance.quiz4_CallingTheSuperclassConstructor;

public class Book extends Publication {
    String author;

    Book(String author) {
        super("C++"); //
        this.author = author;
        System.out.println(author);
    }

    public static void main(String[] args) {
        Book book = new Book("David");
    }
}
