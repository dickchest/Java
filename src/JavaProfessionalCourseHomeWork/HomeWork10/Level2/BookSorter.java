package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import java.util.*;

public class BookSorter {
    public static void main(String[] args) {

        Author agathaChristie = new Author("Agatha", "Christie", 1890);
        Author williamShakespeare = new Author("William", "Shakespeare", 1564);
        Author jRowling = new Author("J.K.", "Rowling", 1965);

        List<Author> authors = Arrays.asList(agathaChristie,williamShakespeare, jRowling);

        PublishHouse penguin = new PublishHouse("Penguin Random House", 2013);
        PublishHouse harper = new PublishHouse("HarperCollins", 1817);
        PublishHouse hachette = new PublishHouse("Hachette Livre", 2013);

        List<PublishHouse> publishHouses = Arrays.asList(penguin, harper, hachette);

        List<Book> books = new ArrayList<>();

        books.add(new Book(agathaChristie, 1934,"Murder on the Orient Express", penguin));
        books.add(new Book(agathaChristie, 1939,"And Then There Were None", penguin));
        books.add(new Book(agathaChristie, 1926,"The Murder of Roger Ackroyd", hachette));

        books.add(new Book(williamShakespeare, 1600,"Hamlet", hachette));
        books.add(new Book(williamShakespeare, 1595,"Romeo and Juliet", harper));
        books.add(new Book(williamShakespeare, 1606,"Macbeth", harper));
        books.add(new Book(williamShakespeare, 1603,"Othello", harper));

        books.add(new Book(jRowling, 1997,"Harry Potter and the Philosopher's Stone", harper));
        books.add(new Book(jRowling, 2007,"Harry Potter and the Deathly Hallows", penguin));
        books.add(new Book(jRowling, 2012,"The Casual Vacancy", hachette));


        System.out.println(books);

        System.out.println("--- sort by year ---");
        Collections.sort(books);
        System.out.println(books);

        System.out.println("--- sort by name ---");
        Collections.sort(books, new booksNameComparator());
        System.out.println(books);

        System.out.println("--- sort by publish house ---");
        Collections.sort(books, new booksPublishHouseComparator());
        System.out.println(books);

        System.out.println("--- sort by author (asc) ---");
        Collections.sort(books, new booksAuthorComparator());
        System.out.println(books);

        System.out.println("--- sort by author (des) ---");
        Collections.sort(books, new booksAuthorComparator().reversed());
        System.out.println(books);

        System.out.println("--- sort autors by year and surname ---");
        Collections.sort(authors);
        System.out.println(authors);

        /*
        4. Напишите мини-программу которая будет сортировать книги, программа
        будет спрашивать пользователя как он хочет сортировать
        (подумайте как можно сделать)
         */
        System.out.println("--- Task 4 ---");

        Scanner scanner = new Scanner(System.in);
        CustomComparator comp = new CustomComparator();

        comp.chooseComparator(scanner, "сортировать по имени?", new booksNameComparator());
        comp.chooseComparator(scanner, "сортировать по году публикации?", new booksYearOfPublicationComparator());
        comp.chooseComparator(scanner, "сортировать по автору?", new booksAuthorComparator());
        comp.chooseComparator(scanner, "сортировать по издательству?", new booksPublishHouseComparator());

        Collections.sort(books, comp.getComparator());
        System.out.println(books);

    }
}
