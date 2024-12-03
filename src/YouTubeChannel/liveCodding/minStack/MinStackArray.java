package YouTubeChannel.liveCodding.minStack;

import java.util.*;

public class MinStackArray {
    List<Integer> stack;

    public MinStackArray() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
//        return Collections.min(stack);
        return stack.stream().min(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("Список пуст"));
    }
}
