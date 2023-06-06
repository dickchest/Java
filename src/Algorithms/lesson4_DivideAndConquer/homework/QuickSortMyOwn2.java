package Algorithms.lesson4_DivideAndConquer.homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class QuickSortMyOwn2 {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        int[] array1 = {7, 2, 1, 6, 8, 5, 3, 4};
        int[] array2 = {7, 2, 1, 6, 8, 5, 3, 4};


        System.out.println("bubble sort 1");
        bubbleSort(array1);
        printArray(array1);

        System.out.println("bubble sort 2");
        bubbleSort1(array2);
        printArray(array2);

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            printSortStep(arr, from, to, divideIndex);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }



    private static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int rightIndex, int leftIndex) {
        int swap = arr[rightIndex];
        arr[rightIndex] = arr[leftIndex];
        arr[leftIndex] = swap;
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.println("partition at index: " + partitionIndex + " (" + arr[partitionIndex] + ")");
        System.out.print("left: ");
        printArray(Arrays.copyOfRange(arr, from, partitionIndex));
        System.out.print("right: ");
        printArray(Arrays.copyOfRange(arr, partitionIndex, to+ 1));
    }

    private static void bubbleSort(int[] arr) {
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    swap(arr, i-1, i);
                    sorted = false;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void bubbleSort1(int[] arr) {
        boolean sorted = false;
        int j = 1;
        int count = 0;

        while (!sorted) {
            sorted = true;
            for (int i = arr.length - 1; i >= j; i--) {
                if (arr[i-1] > arr[i]) {
                    swap(arr, i-1, i);
                    sorted = false;
                    count++;
                }
            }
            j++;
        }
        System.out.println(count);
    }
}