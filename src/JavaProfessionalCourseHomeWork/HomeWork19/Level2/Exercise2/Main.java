package JavaProfessionalCourseHomeWork.HomeWork19.Level2.Exercise2;

import java.util.*;
import java.util.stream.Collectors;

/*
2. Создайте House(street, number, price, buildingYear), создайте 10 домов, положите их в лист нужно найти:
- дом с максимальной ценой, иначе вернуть -1
- дом с минимальной ценой и имеющий нечетный номер
- все дома с ценой меньше 200_000 и больше 100_000 и выбрать только 2 из них
- цены домов, находящихся на улице Max Platz
- количество нечетных домов
- стоимость всех домов на улице Max Platz
 */
public class Main {
    public static void main(String[] args) {
        // инициализация
        List<House> houses = new ArrayList<>();
        houses.add(new House("Main Street", 1, 110_000.0, 1990));
        houses.add(new House("Second Street", 2, 190_000.0, 2000));
        houses.add(new House("Third Street", 3, 195_000.0, 2010));
        houses.add(new House("Fourth Street", 4, 400000.0, 2020));
        houses.add(new House("Max Platz", 5, 500000.0, 1995));
        houses.add(new House("Sixth Street", 6, 600000.0, 2005));
        houses.add(new House("Seventh Street", 7, 700000.0, 2015));
        houses.add(new House("Max Platz", 8, 800000.0, 2021));
        houses.add(new House("Max Platz", 9, 900000.0, 2002));
        houses.add(new House("Tenth Street", 10, 1000000.0, 2011));

        // - дом с максимальной ценой, иначе вернуть -1
        Optional<House> maxPriceHouse = houses.stream()
                .max(Comparator.comparingDouble(s-> s.price()));

        System.out.println(maxPriceHouse);
        System.out.println("---");

        // - дом с минимальной ценой и имеющий нечетный номер
        Optional<House> minPriceHouseAndEven = houses.stream()
                .filter(v-> (v.number() % 2) != 0)
                .min(Comparator.comparingDouble(s-> s.price()));

        System.out.println(minPriceHouseAndEven);
        System.out.println("---");

        // - все дома с ценой меньше 200_000 и больше 100_000 и выбрать только 2 из них
        List<House> resultListOfTwo = houses.stream()
                .filter(v-> v.price() < 200000)
                .filter(v-> v.price() > 100000)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(resultListOfTwo);
        System.out.println("---");

        // - - цены домов, находящихся на улице Max Platz
        List<Double> pricesOfHousesAtTheStreet = houses.stream()
                .filter(v-> v.street().equals("Max Platz"))
                .map(v->v.price())
                .collect(Collectors.toList());

        System.out.println(pricesOfHousesAtTheStreet);
        System.out.println("---");

        // - количество нечетных домов
        long quantityOfEvenHouses = houses.stream()
                .filter(v-> v.number()%2 != 0)
                .map(v->v.price())
                .count();

        System.out.println(quantityOfEvenHouses);
        System.out.println("---");

        //- стоимость всех домов на улице Max Platz
        Optional<Double> totalSumOfMaxPlatzHouses = houses.stream()
                .filter(v-> v.street().equals("Max Platz"))
                .map(v->v.price())
                .reduce(Double::sum);

        System.out.println(totalSumOfMaxPlatzHouses);
        System.out.println("---");
    }
}
