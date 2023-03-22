package JavaProfessionalCourseHomeWork.HomeWork18.Level1;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

/*
11. Используя соответственный примитивный интерфейс Supplier получить рандом значения и вывести их в консоль.
(например BooleanSupplier booleanSupplier = () -> random.nextBoolean();)
 */
public class Exercise11 {
    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier intSupplier = () -> random.nextInt();
        BooleanSupplier booleanSupplier = () -> random.nextBoolean();
        DoubleSupplier doubleSupplier = () -> random.nextDouble();

        System.out.println(intSupplier.getAsInt());
        System.out.println(booleanSupplier.getAsBoolean());
        System.out.println(doubleSupplier.getAsDouble());
    }
}
