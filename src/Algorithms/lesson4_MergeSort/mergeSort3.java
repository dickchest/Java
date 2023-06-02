package Algorithms.lesson4_MergeSort;

import java.util.Arrays;
import java.util.Random;

public class mergeSort3 {

    public static void main(String[] args) {
        /*
mergeSort(arr) - function that sorts
arr[leftIndex..rightIndex] using merge()
merge(arr, leftArr, rightArr) - Merges two sub arrays
of arr[].
         */
        // инициализируем рандомный большой массив
        double[] array = new double[1_000];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextDouble(1_000);
        }

        System.out.println("Given array");
//        System.out.println(Arrays.toString(array));

        // запоминаем время
        long startTime = System.currentTimeMillis();
        mergeSort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
        System.out.println("Время " + (System.currentTimeMillis() - startTime));
    }


    public static void mergeSort(double[] arr) {
        int lengthArray = arr.length; // длина массива

        if (lengthArray == 1) { // условие выхода
            return;
        }

        int mid = lengthArray / 2; // вычисляем середину массива
        double[] leftArr = new double[mid]; // левый подмассив
        double[] rightArr = new double[lengthArray - mid]; // правый подмассив

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

    private static void merge(double[] arr, double[] leftArr, double[] rightArr) {
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
