/*
67. Add Binary
Easy
Topics
Companies
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
package leetCode;

public class _67_AddBinary {

    public static void main(String[] args) {
        String a = "1";
        String b = "111";
        System.out.println(addBinarySolution(a, b));
    }

    public static String addBinarySolution(String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int i = charArrA.length - 1, j = charArrB.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int aNum = i >= 0 ? charArrA[i] - '0' : 0;
            int bNum = j >= 0 ? charArrB[j] - '0' : 0;

            int sum = aNum + bNum + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;

            stringBuilder.append(Integer.toString(digit));
        }
        return stringBuilder.reverse().toString();
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int intA, intB;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            intA = a.charAt(i) - '0';
            intB = Character.getNumericValue(b.charAt(j));
            int sum = intA + intB + carry;
            carry = getResult(sum, result, carry);
            i--;
            j--;
        }

        while (i >= 0) {
            intA = a.charAt(i) - '0';
            int sum = intA + carry;
            carry = getResult(sum, result, carry);
            i--;
        }

        while (j >= 0) {
            intB = b.charAt(j) - '0';
            int sum = intB + carry;
            carry = getResult(sum, result, carry);
            j--;
        }
        if (carry == 1) {
            result.insert(0, "1");
        }
        return result.toString();
    }

    private static int getResult(int sum, StringBuilder result, int carry) {
        switch (sum) {
            case 0 -> {
                result.insert(0, "0");
                carry = 0;
            }
            case 1 -> {
                result.insert(0, "1");
                carry = 0;
            }
            case 2 -> {
                result.insert(0, "0");
                carry = 1;
            }
            case 3 -> {
                result.insert(0, "1");
                carry = 1;
            }
        }
        return carry;
    }
}
