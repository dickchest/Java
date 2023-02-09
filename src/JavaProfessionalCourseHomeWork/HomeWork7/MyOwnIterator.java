package JavaProfessionalCourseHomeWork.HomeWork7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyOwnIterator implements Iterator<Integer> {
    private int[] array;
    private int currentIndex = -1;
    private int maxIndex;

    public MyOwnIterator(int[] array) {
        this.array = array;
        maxIndex = array.length;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < maxIndex-1;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }
        currentIndex++;
        return array[currentIndex];
    }
}
