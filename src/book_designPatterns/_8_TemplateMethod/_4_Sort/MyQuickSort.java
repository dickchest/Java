package book_designPatterns._8_TemplateMethod._4_Sort;

import java.util.Arrays;

public class MyQuickSort {
    public static void quickSort(int[] array, int low, int high) {
        System.out.println("low = " + low + ", high = " + high);
        // base condition
        if (low >= high) return;

        // pivot point
        int pivotIndex = pivot(array, low, high);

        // recursion
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }

    private static int pivot(int[] array, int low, int high) {
        int pivotValue = array[high];

        int i = low - 1; // начало элементов до опорного

        for (int j = low; j < high; j++) { // проходимся по всему диапазону
            if (array[j] < pivotValue) { // находим элементы, которые должны стоять слева от опоры
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, high); // ставим опорный элемент на свое место
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {13, 3, 5, 1, 6, 15, 1, 3,2,1};
        System.out.println("Given array:");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}
