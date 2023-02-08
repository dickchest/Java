package JavaProfessionalCourse.Lesson7;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class TestBook {
    public static void main(String[] args) {
        Book book = new MangoBook();
        book.addSheet("Harry Poter part 1");
        book.addSheet("list data");
        book.addSheet("Part 1");
        book.addSheet("Part 2");
        book.addSheet("The end");

        for (Sheet sheet : book) {
            System.out.println(sheet);
        }



//        for(Sheet sheet: book) {

    }
}

