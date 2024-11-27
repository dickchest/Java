package book_ImproveJava._8_Inheritance.quiz1_CallingTheSuperclassConstructor;

public class Book extends Publication{
    String author;

    public Book(String author) {
        super("Python");
        this.author = author;
    }

    public static void main(String[] args) {
        Book book = new Book("David");
        System.out.print(book.title + " ");
    }
}
