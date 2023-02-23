package JavaProfessionalCourseHomeWork.HomeWork11.Level2;

import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {

        // создаем стек из символов
        System.out.println(isValid("(())("));
        System.out.println(isValid("(())"));
    }

    private static boolean isValid(String string) {
        System.out.println(string);
        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (Character s : charArray) {
            if (s == '(') {
                stack.push(s);
            } else if (s == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size() != 0) return false;
        return true;
    }
}
