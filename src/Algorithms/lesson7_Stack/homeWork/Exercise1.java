package Algorithms.lesson7_Stack.homeWork;


import java.util.HashMap;
import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        String str1 = "(sdkf{sdf[]d}sdf )";
        String str2 = "([)]";
        String str3 = "{()]";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
    }

    private static boolean isValid(String string) {
        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');


        for (Character character : charArray) {
            if (hashMap.containsKey(character)) {
                stack.push(character);
            } else if (hashMap.containsValue(character)) {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                    return false;
                }
                Character fromStack = stack.pop();
                if (character != hashMap.get(fromStack)) {
                    System.out.println("key != object");
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            System.out.println("sack.size != 0");
            return false;
        }
        return true;
    }
}
