package Algorithms.lesson4_DivideAndConquer;

public class BinarySearch {
    // Функция для поиска элемента x в массиве arr[] и возврата его индекса
    // Возвращает -1, если элемент отсутствует в массиве

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x1 = 114;

        System.out.println("Индекс элемента " + x1 + " в массиве arr1: " + binarySearch(arr1, x1));

    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // проверяем, находится ли элемент в середине массива

            if (arr[mid] == x) return mid;

            if (x > arr[mid]) { // игнорируем левую часть
                left = mid + 1;
            } else { // игронируем правую часть
                right = mid - 1;
            }
        }
        return -1; // если элемент не найден, возвращем -1;
    }
}
