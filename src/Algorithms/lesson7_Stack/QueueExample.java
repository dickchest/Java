package Algorithms.lesson7_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /*
        firs in first out - FIFO
         */

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(54);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer(5));

    }
}
