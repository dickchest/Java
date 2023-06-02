package Algorithms.lesson5_MergeSort;

import java.util.Arrays;

public class mergeSort {
    static int count = 0;

    public static void main(String[] args) {
        /*
mergeSort(arr) - function that sorts
arr[leftIndex..rightIndex] using merge()
merge(arr, leftArr, rightArr) - Merges two sub arrays
of arr[].
         */


        int[] array = {15, 21, 13, 5, 10, 7};
        System.out.println("Given array");
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));

        System.out.println("Количество сравнений = " + count);
    }

    public static void mergeSort(int[] arr) {
        int lengthArray = arr.length; // длина массива

        if (lengthArray == 1) { // условие выхода
            return;
        }

        int mid = lengthArray / 2; // вычисляем середину массива
        int[] leftArr = new int[mid]; // левый подмассив
        int[] rightArr = new int[lengthArray - mid]; // правый подмассив

        // копируем элементы из массива в подмассив
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[mid + i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        // когда достигли базового условия, начинаем слияние
        merge(arr, leftArr, rightArr);


    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;

        // контролируем индексы подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // контролируем индексы в основном массиве
        int arrIndex = 0;

        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) { // сравниваем элементы в левом и правом подмассиве
                arr[arrIndex] = leftArr[leftIndex];
                leftIndex++;
                arrIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
                arrIndex++;
            }
            count++;
        }

        // копируем элементы если остались из левого массива
        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        // копируем элементы из правого
        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }

    }
}
