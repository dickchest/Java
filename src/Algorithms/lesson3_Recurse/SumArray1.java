package Algorithms.lesson3_Recurse;

public class SumArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};
        System.out.println(sumArray(arr, arr.length-1));
    }

    public static int sumArray(int[] arr, int step) {
        if (step < 0) {
            return 0;
        } else {
            return arr[step] + sumArray(arr, step - 1);
        }
    }
}
