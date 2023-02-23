package JavaProfessionalCourseHomeWork.HomeWork11.Level1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
8. Создайте экземпляры Stack, Deque (LinkedList), Deque (ArrayDeque), добавьте туда 1 млн строк (метод push),
после достаньте элементы пока есть элементы(метод pool), сделайте замер времени для добавления и для доставания,
напишите в отдельный файл результат вычисления и постарайтесь дать объяснение почему что-то отработало быстрее
 */
public class Exercise8 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Deque<String> dequeLinked = new LinkedList<>();
        Deque<String> dequeArray = new ArrayDeque<>();

        long before;
        long after;

        addingElements(stack, "Stack");
        addingElements(dequeLinked, "LinkedList");
        addingElements(dequeArray, "ArrayDeque");

        System.out.println("-----------------");

        poppingElements(stack, "Stack");
        poppingElements(dequeLinked, "LinkedList");
        poppingElements(dequeArray, "ArrayDeque");

    }

    public static void addingElements(Stack<String> stack, String name) {
        long before;
        long after;
        System.out.println("Adding: " + name);
        before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stack.push("test");
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void addingElements(Deque<String> deque, String name) {
        long before;
        long after;
        System.out.println("Adding: " + name);
        before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            deque.push("test");
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);
    }


    public static void poppingElements(Stack<String> stack, String name) {
        long before;
        long after;
        System.out.println("Pop: " + name);
        before = System.currentTimeMillis();
        while (!stack.empty()) {
            stack.pop();
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void poppingElements(Deque<String> deque, String name) {
        long before;
        long after;
        System.out.println("Pop: " + name);
        before = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.pop();
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
