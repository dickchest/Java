package JavaProfessionalCourse.Lesson8LinkedList.RepeatHomeWork7;

import java.util.Iterator;

public class HomeWork7CircleIterator implements Iterator<Integer> {
        private Integer[] array;
        private int currentIndex;

    public HomeWork7CircleIterator(Integer[] array) {
        this.array = array;
    }


    // [3, 7, 8, 4]




    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        Integer current = array[currentIndex];
        if (currentIndex == array.length - 1) {
            currentIndex = 0;
        }
        currentIndex++;
        return current;
    }
}
