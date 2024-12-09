/*
69. Sqrt(x)
Easy
Topics
Companies
Hint
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */

package leetCode;

public class _69_SqrtX {

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrtSolution(x));
    }

    public static int mySqrtSolution(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1;
        int end = x;
        int middle = -1;

        while (start <= end) {
            middle = start + (end-start)/2;

            long square = (long) middle * middle;
            if (square == x) return middle;
            if (square > x) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end;
    }

    public static int mySqrt(int x) {
        int border;
        if (x >=2) {
            border = x / 2;
        } else {
            border = x;
        }

        for (int i = border; i >= 0; i--) {
            if (x / i >= i) {
                return i;
            }
        }
        return 0;
    }
}
