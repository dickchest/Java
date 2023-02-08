package JavaProfessionalCourse.Lesson7;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ReverseIterator implements Iterator<Sheet> {
    private final List<Sheet> originalList;
    private int currentIndex;

    public ReverseIterator(List<Sheet> originalList) {
        this.originalList = originalList;
        currentIndex = originalList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Sheet next() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }

        Sheet current = originalList.get(currentIndex);
        currentIndex--;
        return current;
    }
}
