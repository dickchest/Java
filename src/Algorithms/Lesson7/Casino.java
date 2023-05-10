package Algorithms.Lesson7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Casino {
    public static void main(String[] args) {
        /* лучше использовать стек
        а не так как я реализовал
         */
        Queue gamers = new LinkedList<>();
        Stack<Integer> bonuses = new Stack<>();


        for (int i = 0; i < 50; i++) {
            bonuses.add(1000);
        }
        // добавление в очередь остальных участников

        // раздача очереди
        while (!gamers.isEmpty()) {
            System.out.println(bonuses.pop());
        }
    }
}
