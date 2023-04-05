package JavaProfessionalCourseHomeWork.HomeWork21.Level1;
/*
11. Напишите метод buyFood, внутри метода вызовите методы buyBread(используйте логику из предыдущей задачи),
buyMeat, необходимо чтобы мы не падали, если при покупке хлеба выкинулась ошибка (используйте try/catch)
 */

import java.util.ArrayList;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) throws PriceIsToHighException {
        List<Integer> breads = List.of(12, 7, 6, 15, 9, 1, 3);
        List<Integer> meat = List.of(15, 7, 10, 55, 12, 99, 5);
        List<Integer> food = new ArrayList<>();

        for (Integer price : meat) {
            food.add(buyMeat(price));
        }

        for (Integer price : breads) {
            try {
                food.add(buyBread(price));
            } catch (PriceIsToHighException e) {
                System.out.println("Цена на хлеб слишком большая: " + price);
            }
        }
        System.out.println(food);
    }

    private static int buyMeat(Integer price) {
        return price;
    }

    private static int buyBread(Integer price) throws PriceIsToHighException {
        if (price > 8) {
            throw new PriceIsToHighException("хлеб слишком дорогой");
        }
        return price;
    }
}

