package JavaProfessionalCourse.Lesson7_Iterator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book implements Iterable<Sheet> {
    protected List<Sheet> sheets = new ArrayList<>();
    private int page = 0;
    public Book() {
    }

    public void addSheet(String text) {
        sheets.add(new Sheet(text, page++));
    }


    @NotNull
    @Override
    public Iterator<Sheet> iterator() {
        return sheets.iterator();
    }
}
