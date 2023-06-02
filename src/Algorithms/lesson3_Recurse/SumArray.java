package Algorithms.lesson3_Recurse;

public class SumArray {
        static int[] array = {1,2,3};
    public static void main(String[] args) {
        System.out.println(sumArray(array.length, 0));
        
        
    }

    private static int sumArray(int index, int sum) {
        if (index == 0) {
            System.out.println("index = 0");
            return sum;
        } else {
            index--;
            return sumArray(index, sum + array[index]);
        }
    }


}
