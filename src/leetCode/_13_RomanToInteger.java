package leetCode;

import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        String s = "MMMCMXCIIX";

        Map<Character, Integer> git = new HashMap<>();

        git.put('I', 1);
        git.put('V', 5);
        git.put('X', 10);
        git.put('L', 50);
        git.put('C', 100);
        git.put('D', 500);
        git.put('M', 1000);

        int sum = 0;
        int prev = 0;
        int direction = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int cur = git.get(currentChar);

            if (prev > cur) {
                direction = -1;
            } else if (prev < cur) {
                direction = 1;
            }

            sum = sum + direction * cur;

            prev = cur;
        }
    }
}
