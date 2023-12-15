package leetCode;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = '()'
Output: true
Example 2:

Input: s = '()[]{}'
Output: true
Example 3:

Input: s = '(]'
Output: false
 */

import java.util.Stack;

public class _20_ValidParentheses {

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

       for(int i = 0; i < s.length(); i++) {
           Character str = s.charAt(i);
           
            if (str == '{' || str == '(' || str == '[') {
                stack.add(str);
            } else {
                if (stack.isEmpty()) return false;
                Character getStr = stack.pop();
                if (str == ')' && getStr != '(') return false;
                if (str == '}' && getStr != '{') return false;
                if (str == ']' && getStr != '[') return false;
            }
        }
        if (stack.empty()) return true;
        return false;

    }
}
