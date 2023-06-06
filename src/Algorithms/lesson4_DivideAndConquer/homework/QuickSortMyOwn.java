package Algorithms.lesson4_DivideAndConquer.homework;

import java.util.Arrays;

/*
1. Из массива выбирается некоторый опорный элемент
2. Перекладываем все элементы влево либо вправо от опорного элемента.
    Тем самым массив разбивается на две части:
    не отсортированные элементы слева от разрешающего элемента;
    не отсортированные элементы справа от разрешающего элемента.
 3. Чтобы отсортировать эти 2 меньших подмассива,
 алгоритм рекурсивно вызывает сам себя
 */
public class QuickSortMyOwn {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);


    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
        // условие выхода из рекурсии
        if (array.length == 0 || leftIndex >= rightIndex) return;
        // выбор опорного элемента
        int pivot = array[(leftIndex + rightIndex) / 2];

        // каретка слева на правао и справа на лево
        int leftMarkerIndex = leftIndex;
        int rightMarkerIndex = rightIndex;

        while (leftMarkerIndex <= rightMarkerIndex) {
            // перекладываем все элементы влево либо вправо от опорного элемента
            while (array[leftMarkerIndex] < pivot) leftMarkerIndex++;
            while (array[rightMarkerIndex] > pivot) rightMarkerIndex--;
            // если уперлись в несоотвествие и справа уперлись в несоотвествие
            // Если левый маркер все еще меньше правого, то нужно менять элементы,
            // потому что до этого не отработа два while
            if (leftMarkerIndex <= rightMarkerIndex) {
                int swap = array[leftMarkerIndex];
                array[leftMarkerIndex] = array[rightMarkerIndex];
                array[rightMarkerIndex] = swap;
                // сдвигаем массив, чтобы получить новые границы
                leftMarkerIndex++;
                rightMarkerIndex--;
            }
        }
        // 3. рекурсия для сортировки левой и првой части
        // есил у нас есть левый подмассив (от начала до правого маркера пришедшего в середину
        if (leftIndex < rightMarkerIndex) quickSort(array, leftIndex, rightMarkerIndex);
        // есил у нас есть правый подмассив (от конца до левого маркера пришедшего в середину
        if (rightIndex < leftMarkerIndex) quickSort(array, leftMarkerIndex, rightIndex);

    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }
}