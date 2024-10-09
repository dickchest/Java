package book_designPatterns._8_TemplateMethod._4_Sort;

import Utils.Utils;

import java.util.Arrays;

public class MyQuickSort1 {
    public static void main(String[] args) {
        Integer[] array = {13, 3, 5, 1, 6, 1};
        System.out.println("Given array:");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(Integer[] array, int low, int high) {
        // base condition
        if (low < high) {
            // опорный элемент
            int pivot = pivot(array, low, high);
            // рекурсия
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }

    }

    private static int pivot(Integer[] array, int low, int high) {
        // переменные
        int pivotValue = array[high];
        int i = low;
        // цикл
        for (int j = low; j < high; j++) {
            if (array[j] < pivotValue) {
                Utils.swap(array, i++, j);
            }
        }
        // ставим опорник на место
        Utils.swap(array, i, high);
        return i;
    }
}
