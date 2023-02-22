package JavaProfessionalCourse.Lesson11.RepeatHomeWork10.Task6;

public class Advertisement {
    private int price;
    String name;
    String description;
    String author;
    int publicationYear;

    public int getPrice() {
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public Advertisement(int price,
                         String name,
                         String description,
                         String author,
                         int publicationYear) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.author = author;
        this.publicationYear = publicationYear;


    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
