package JavaProfessionalCourse.Lesson15_ImmutableClasses;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator1 implements Iterator<Integer> {

    private Integer[] array;
    private int currentIndex;

    public ArrayIterator1(Integer[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex< array.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            System.out.println("Array reached his end");
            throw new NoSuchElementException("test");
        }
        return array[currentIndex++];
    }
}