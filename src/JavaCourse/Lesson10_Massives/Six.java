package JavaCourse.Lesson10_Massives;

import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        /* статические массивы имеют точно фиксированную длину
        динамические лучши. колво увеличивается автоматически

         */
        /// TODO: 14.11.2022 найти инфу по динамическоим самому

        // МНОГОМЕРНЫЕ МАССИВЫ

        int[][] intArray = new int[10][10];
        intArray[0][0] = 5;

        String[][] table = new String[10][10];
        table[0][0] = "header0";
        table[0][1] = "header1";

        table[1][0] = "header0_data";
        table[1][1] = "header1_data";

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
// ========================================
        // METHOD fill
        String[] emptyStrings = new String[10];
        Arrays.fill(emptyStrings, "x");

        System.out.println(Arrays.toString(emptyStrings));
    }
}
