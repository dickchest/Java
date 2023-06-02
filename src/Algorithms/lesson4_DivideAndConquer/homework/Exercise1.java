package Algorithms.lesson4_DivideAndConquer.homework;

/*
Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256

 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] m = {100, 112, 256, 349, 770};
        int[] n = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        System.out.println(getElementOfTwoArrays(m, n, k));
    }

    private static int getElementOfTwoArrays(int[] m, int[] n, int k) {
        int mCount = 0;
        int nCount = 0;
        int returnValue = 0;

        for (int i = 0; i <= k; i++) {
            if(m[mCount] < n[nCount]) {
                returnValue = m[mCount];
                mCount++;

            } else {
                returnValue = n[nCount];
                nCount++;
            }
        }
        return returnValue;
    }
}
