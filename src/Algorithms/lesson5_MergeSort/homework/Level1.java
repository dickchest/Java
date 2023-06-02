package Algorithms.lesson5_MergeSort.homework;

import java.util.Arrays;

/*
У вас есть список из n элементов, которые представляют собой оценки студентов по математике. Вам нужно
отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает
новый список, отсортированный в порядке убывания.

 */
public class Level1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 4, 2, 7, 6, 5};

        System.out.println(Arrays.toString(mergerSort(arr)));
    }

    private static int[] mergerSort(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return arr;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // заполняем левый массив
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        // заполняем правый массив
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        // рекурсивно вызываем для каждого массива
        left = mergerSort(left);
        right = mergerSort(right);

        // после базового условия делаем merge
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int leftCount = 0;
        int rightCount = 0;
        int arrCount = 0;

        while (leftCount < left.length && rightCount < right.length) {
            if (left[leftCount] > right[rightCount]) {
                arr[arrCount] = left[leftCount];
                leftCount++;
                arrCount++;
            } else {
                arr[arrCount] = right[rightCount];
                rightCount++;
                arrCount++;
            }
        }

        while (leftCount < left.length) {
            arr[arrCount] = left[leftCount];
            leftCount++;
            arrCount++;
        }

        while (rightCount < right.length) {
            arr[arrCount] = right[rightCount];
            rightCount++;
            arrCount++;
        }

        return arr;
    }
}
