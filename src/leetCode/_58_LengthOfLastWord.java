/*
58. Length of Last Word
Easy
Topics
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */
package leetCode;

public class _58_LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord2(str));
    }


    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int length = arr[arr.length - 1].length();
        return length;
    }

    public static int lengthOfLastWord2(String s) {
        int start, end;
        end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
