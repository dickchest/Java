package Algorithms.Lesson9;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 7, 9, 9, 5};
        Arrays.sort(inputArray);

        String result = "";
        for (int i = inputArray.length-1; i >=0 ; i--) {
            result += inputArray[i];
        }
        System.out.println(result);
    }
}
