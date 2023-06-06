package Algorithms.Level10;

import java.util.Arrays;

/*
Given an array arr[] of positive integers. Flip each group of subarrays of size K.
Example 1:
K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: The first group consists of elements
1, 2, 3. The second group consists of 4,5.
Example 2:
K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
Your task:
The challenge is to write a reverse(arr, k) function that takes an array and K as input and modifies the array in place.
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        reverse(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int k) {
        int n = arr.length;
        if (k > n || k < 0) {
            System.out.println("К больше длины массива или меньше 0. ошибка");
            return;
        }

        int i = 0;

        while (i < n) {
            int from = i;
            int to = Math.min(i + k - 1, n - 1);

            while (from < to) {
                int tmp = arr[from];
                arr[from] = arr[to];
                arr[to] = tmp;
                from++;
                to--;
            }

            i += k;
        }
    }
}
