package JavaProfessionalCourseHomeWork.HomeWork18.Level1.Exercise12;

import java.util.function.Function;

public class Exercise12Test {
    public static void main(String[] args) {
        FormulaFunction<Double,Double,Double,Double,Double> myFormula =
                (radius, height, pi, multiplier) ->
                pi*radius*radius*height*multiplier;

        double radius = 5.0;
        double heigt = 10.0;
        double pi = Math.PI;
        double multiplier = 1.0;

        double volume = myFormula.calculate(radius, heigt, pi, multiplier);
        System.out.println(volume);

    }
}
