package YouTubeChannel.liveCodding.minStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class MinStack {
    List<Integer> stack;
    TreeSet<Integer> treeSet;

    public MinStack() {
        stack = new ArrayList<>();
        treeSet = new TreeSet<>();
    }

    public void push(int val) {
        stack.add(val);
        treeSet.add(val);
    }

    public void pop() {
        Integer last = stack.get(stack.size() - 1);
        stack.remove(last);
        treeSet.remove(last);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return treeSet.first();
    }

    public void print() {
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
