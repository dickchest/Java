package Algorithms.lesson3_Recurse;

public class Factorial {
    static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
    }
}
