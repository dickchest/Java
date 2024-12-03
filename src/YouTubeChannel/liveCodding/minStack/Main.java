package YouTubeChannel.liveCodding.minStack;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.print();
        minStack.pop();
        minStack.push(3);
        minStack.top();
        minStack.print();
        System.out.println(minStack.getMin());
    }


}
