package Algorithms.lesson3_DivideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {70, 250, 50, 300, 1, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            // завершить выполнение, если больше нечего делать
            return;
        }

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, которые больше или меньше опорного элемента
        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                // меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j]= temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

}
