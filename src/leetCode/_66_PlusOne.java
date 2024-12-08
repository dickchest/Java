package leetCode;

import java.util.Arrays;

public class _66_PlusOne {
    public static void main(String[] args) {
        int[] x = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(x)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigists = new int[digits.length + 1];
        newDigists[0] = 1;
        return newDigists;
    }
}
