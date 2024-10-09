package book_designPatterns._8_TemplateMethod._4_Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {15, 2, 7, 3, 5};
        System.out.println("Given array");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        // base condition
        if (array.length == 0 || low >= high) return;

        // pivot element
//        int pivot = low + (high - low) / 2;
        int pivot = high;
        int pivotElement = array[pivot];
        System.out.println("pivot: " + pivot + "; pivotElement: " + pivotElement);

        int lowIndex = low;
        int highIndex = high;

        while (lowIndex <= highIndex) {
            while (array[lowIndex] < pivotElement) {
                lowIndex++;
            }
            while (array[highIndex] > pivotElement) {
                highIndex--;
            }
            if (lowIndex <= highIndex) {
                System.out.println("swapping " + lowIndex + " and " + highIndex);
                swap(array, lowIndex, highIndex);
                lowIndex++;
                highIndex--;
            }
            System.out.println(Arrays.toString(array));

            if (low < highIndex)
                quickSort(array, low, highIndex);

            if (high > lowIndex)
                quickSort(array, lowIndex, high);
        }
    }

    private static void swap(int[] array, int lowIndex, int highIndex) {
        int temp = array[lowIndex];
        array[lowIndex] = array[highIndex];
        array[highIndex] = temp;
    }


}
