package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise6;

/*
6. Создайте класс объявление, у объявления есть цена, название, описание, автор и год публикации,
создайте объект газеты и заполните его 10 объявлениями, отсортируйте их, в первую очередь важен год,
после название, автор и в последнюю очередь описание
 */

public class Advert {
    private double price;
    private String name;
    private String description;
    private String author;
    private int year;

    public Advert(double price, String name, String description, String author, int year) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.author = author;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}'+ '\n';
    }


}
