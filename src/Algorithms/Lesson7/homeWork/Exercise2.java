package Algorithms.Lesson7.homeWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(isSymetrick(str));
    }

    private static boolean isSymetrick(String str) {
        int length = str.length();
        // проверяем, что длина не равна нулю
        if (length == 0 || length == 1) return true;

        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        int middle = (length % 2 == 0) ? length/2 : length / 2 + 1;
        for (int i = 0; i < length / 2; i++) {
            queue.add(chars[i]);
            stack.push(chars[middle+i]);
        }
        while (!queue.isEmpty()) {
            char x = queue.poll();
            char y = stack.pop();
            if (x != y) {
                return false;
            }
        }
        return true;
    }
}
