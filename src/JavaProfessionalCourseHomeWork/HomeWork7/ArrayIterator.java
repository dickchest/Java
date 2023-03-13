package JavaProfessionalCourseHomeWork.HomeWork7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator<Integer> {

    private int[] array;
    private int currentIndex;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            System.out.println("Array reached his end");
            throw new NoSuchElementException("test");
        }
        return array[currentIndex++];
    }


    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};

        ArrayIterator iterator = new ArrayIterator(array);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
