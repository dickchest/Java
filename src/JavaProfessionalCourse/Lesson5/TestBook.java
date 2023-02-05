package JavaProfessionalCourse.Lesson5;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Harry Poter", "Rouling");
        Book book2 = new Book("Harry Poter", "Rouling");
        Book book3 = book;

        System.out.println(book==book2);
        System.out.println(book == book);
        System.out.println(book == book3);
        System.out.println(book3 == book2);
        System.out.println(book.equals(book2)); // book == book2

    }
}
