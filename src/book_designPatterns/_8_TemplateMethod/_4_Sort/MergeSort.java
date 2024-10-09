package book_designPatterns._8_TemplateMethod._4_Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {25, 13, 15, 2, 7};
        System.out.println("Given array");
        System.out.println(Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int arrayLength = array.length;
        // Base condition
        if (arrayLength == 1) return;

        int middle = arrayLength / 2;
        System.out.println("middle = " + middle);
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, arrayLength);

        mergeSort(left);
        mergeSort(right);

        System.out.println("---left: " + Arrays.toString(left) + ", ---right: " + Arrays.toString(right));

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        System.out.println("Заходит массив:" + Arrays.toString(array));
        int k = 0, lIndex = 0, rIndex = 0;

        while (lIndex < left.length && rIndex < right.length) {
            if (left[lIndex] <= right[rIndex]) {
                array[k++] = left[lIndex++];
            } else {
                array[k++] = right[rIndex++];
            }
        }

        while (lIndex < left.length) {
            array[k++] = left[lIndex++];
        }

        while (rIndex < right.length) {
            array[k++] = right[rIndex++];
        }
        System.out.println("Выходит массив:" + Arrays.toString(array));
    }
}
