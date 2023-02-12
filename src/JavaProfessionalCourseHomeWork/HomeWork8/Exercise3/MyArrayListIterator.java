package JavaProfessionalCourseHomeWork.HomeWork8.Exercise3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements Iterator<Integer> {

    private Integer[] array;
    private int currentIndex=0;
    private int maxIndex;

    public MyArrayListIterator(Integer[] array) {
        this.array = array;
        maxIndex = array.length;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < maxIndex;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }
        Integer temp = array[currentIndex];
        this.currentIndex++;
        return temp;
    }
}
