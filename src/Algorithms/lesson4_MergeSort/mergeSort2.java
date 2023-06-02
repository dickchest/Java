package Algorithms.lesson4_MergeSort;

import java.util.Arrays;
import java.util.Random;

public class mergeSort2 {

    public static void main(String[] args) {
        /*
mergeSort(arr) - function that sorts
arr[leftIndex..rightIndex] using merge()
merge(arr, leftArr, rightArr) - Merges two sub arrays
of arr[].
         */
        // инициализируем рандомный большой массив
        int[] array = new int[1_000_00];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1_000);
        }

        int[] array2 = Arrays.copyOf(array, array.length);

        System.out.println("Given array");
//        System.out.println(Arrays.toString(array));

        // запоминаем время
        long startTime = System.currentTimeMillis();
        mergeSort(array);
        System.out.println("Sorted array");
//        System.out.println(Arrays.toString(array));
        System.out.println("Время " + (System.currentTimeMillis() - startTime));

        System.out.println("-----------");
        startTime = System.currentTimeMillis();
        linerSortedArray(array2);
//        System.out.println(Arrays.toString(array2));
        System.out.println("Время линейного подхода " + (System.currentTimeMillis() - startTime));
    }

    private static void linerSortedArray(int[] arr) {
        int lengthArray = arr.length;

        for (int i = 0; i < lengthArray - 1; i++) {
            for (int j = i + 1; j < lengthArray; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
