package JavaProfessionalCourse.Lesson7;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MangoBook extends Book {

    public MangoBook() {
    }

    @Override
    public @NotNull Iterator<Sheet> iterator() {
        return new ReverseIterator(sheets);
    }
}
