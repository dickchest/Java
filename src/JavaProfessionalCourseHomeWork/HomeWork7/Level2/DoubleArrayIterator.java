package JavaProfessionalCourseHomeWork.HomeWork7.Level2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleArrayIterator implements Iterator<Integer> {

    private int[][] array;
    private int maxRow;

    private int currentRowIndex = 0;
    private int currentColumnIndex = 0;

    private int maxColumn;

    public DoubleArrayIterator(int[][] array) {
        this.array = array;
        this.maxRow = array.length - 1;
        this.maxColumn = array[1].length - 1;
    }

    @Override
    public boolean hasNext() {
        return (currentColumnIndex <= maxColumn) && (currentRowIndex <= maxRow);
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("test");
        }

        int tempColumnIndex = currentColumnIndex;
        int tempRowIndex = currentRowIndex;

        if (currentColumnIndex == maxColumn) {
            currentColumnIndex = 0;
            currentRowIndex ++;
        } else {
            currentColumnIndex++;
        }

        return array[tempRowIndex][tempColumnIndex];



    }
}
