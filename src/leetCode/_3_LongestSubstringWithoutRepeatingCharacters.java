package leetCode;

import java.util.*;

/*
3. Longest Substring Without Repeating Characters
Medium

38119

1745

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class _3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        Map<Integer, Integer> table = new HashMap<>();

        int l = 0;
        int r = 1;

        Set<Character> memory = new HashSet<>();

        // заносим в таблицу начало строки и текущую длину
        table.put(l, 1);

        // заносим в память переменную
        memory.add(s.charAt(l));

        while (r < s.length()) {

            if (memory.contains(s.charAt(r))) {
                // если содержит уже такой символ
                memory.remove(s.charAt(l));
                l++;
                table.put(l, r - l);
            } else {
                memory.add(s.charAt(r));
                r++;
                table.put(l, r - l);
            }
        }

        // находим максимальное значение
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue() > table.get(maxKey)) {
                maxKey = entry.getKey();
            }
        }

        return table.get(maxKey);
    }
}
