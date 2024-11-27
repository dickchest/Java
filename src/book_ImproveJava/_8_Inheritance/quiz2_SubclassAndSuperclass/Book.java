package book_ImproveJava._8_Inheritance.quiz2_SubclassAndSuperclass;

public class Book extends Publication {
    String author;

    public Book(String author) {
        this.author = author;
        System.out.print(author);
        System.out.print("HTML ");
    }

    public static void main(String[] args) {
        Book book = new Book("David ");
    }
}
