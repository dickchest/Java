package JavaProfessionalCourse.Lesson6.RepeatHomeWork5;

import java.util.Random;

public class HomeWork5inClass {
    public static void main(String[] args) {

        // созадть 2хмерный массив 5 на 5 заполнить его рандомными значениями и прибавить другой
        TwoDimensionalArray twoDimensionalArrayOne = new JavaTwoDimensionArray(5);
        TwoDimensionalArray twoDimensionalArrayTwo = new JavaTwoDimensionArray(5);
        TwoDimensionalArray sum = twoDimensionalArrayOne.add(twoDimensionalArrayTwo);
        sum.print();

        int x = 5;
        int y = 5;

        int[][] firstArray = new int[x][x];
        int[][] secondArray = new int[x][x];

        // fill in array
        fillArrayWithRandomValues(firstArray);
        fillArrayWithRandomValues(secondArray);
        int[][] sumArray = new int[x][x];
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length ; j++) {
                sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
            }

        }


    }

    private static void fillArrayWithRandomValues(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);

            }
        }
    }
}
