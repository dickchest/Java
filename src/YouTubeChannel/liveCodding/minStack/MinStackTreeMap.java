package YouTubeChannel.liveCodding.minStack;

import java.util.*;

public class MinStackTreeMap {
    TreeMap<Integer, Integer> stack;
    Integer lastValue;

    public MinStackTreeMap() {
        stack = new TreeMap<>();
    }

    public void push(int val) {
        stack.put(lastValue, val);
        lastValue = val;
    }

    public void pop() {
        if (lastValue != null) {
            Integer tempLastValue = stack.get(lastValue);
            stack.remove(lastValue);
            lastValue = tempLastValue;
        }
    }

    public int top() {
        return lastValue;
    }

    public int getMin() {
        return stack.firstEntry().getValue();
    }

    public void print() {
        for (Integer i : stack.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
