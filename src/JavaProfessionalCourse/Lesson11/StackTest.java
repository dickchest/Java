package JavaProfessionalCourse.Lesson11;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("my");
        stack.push("Name");
        stack.push("is");
        stack.push("Robot");

        System.out.println(stack);

        System.out.println(stack.get(1));
        System.out.println(stack.pop()); // достать последний
        System.out.println(stack.peek()); // посмотреть последний

        System.out.println(stack.search("my"));
        System.out.println(stack.search("m"));

        stack.empty();

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);

    }
}
