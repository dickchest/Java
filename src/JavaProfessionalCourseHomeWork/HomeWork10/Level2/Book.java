package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book>{
    Author author;
    private int yearOfPublication;
    private String bookName;
    private PublishHouse publishHouse;

    public Book(Author author, int yearOfPublication, String bookName, PublishHouse publishHouse) {
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.bookName = bookName;
        this.publishHouse = publishHouse;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getBookName() {
        return bookName;
    }

    public PublishHouse getPublishHouse() {
        return publishHouse;
    }

    @Override
    public int compareTo(@NotNull Book o) {
        return Integer.compare(this.yearOfPublication, o.yearOfPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                ", bookName='" + bookName + '\'' +
                ", publishHouse=" + publishHouse +
                '}' + '\n';
    }
}
