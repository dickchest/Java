package Algorithms.lesson3_Recurse;

public class ForI {
    public static void main(String[] args) {
        iteration(5);
        recursion(5);
    }

    public static void iteration(int index) {
        for (int i = index; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void recursion(int index) {
        if (index < 0) {
            return;
        } else {
            System.out.println(index);
            recursion(index-1);
        }
    }
}
