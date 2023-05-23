package Algorithms.Lesson9;

public class Exercise1 {
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 7, 9, 9, 5};
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[i] < inputArray[j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
    }
}

