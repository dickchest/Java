package BookJavaChallanges;

import java.util.ArrayList;
import java.util.List;

public class Exercise2_1_2 {
    public static void main(String[] args) {
        System.out.println(findDivisions(6));
        System.out.println(findDivisions(24));
        System.out.println(findDivisions(7));
    }

    static List<Integer> findDivisions(final int number) {
        final List<Integer> divisions = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisions.add(i);
            }
        }
        return divisions;
    }
}
