package JavaProfessionalCourseHomeWork.HomeWork20.Level2;
/*
Создайте enum Category - FRUIT,GROCERY,PET_PRODUCT,VEGETABLE,MEET объекты Product(price, name, category),
Shop(name, address, workTo(работает до такого-то часа), List) Создайте три магазина и заполните их
разными продуктами из разных категорий

1. Нужно пройтись по всем продуктам из всех магазинов и заполнить мапу - название продукта ключ, значение цена,
если будут дубликаты - необходимо вывести меньшую стоимость и сообщить о дубликате. соберите значения в
- HashMap
- TreeMap
2. Необходимо пройтись по всем магазинам, которые работают после 18 и выбрать фрукты с ценой меньше 5 евро, сгруппировать по имени
3. Необходимо посчитать сколько товаров есть по категориям (скажем FRUIT - 3, GROCERY -2...), подсказка используйте
groupingBy и Collectors.counting()
4. Необходимо сгруппировать по категориям и вывести названия продуктов в каждой категории
5. Необходимо сгруппировать по категориям и вывести наименьшую цену продукта в каждой категории (тут нужно например
к значению применить и mapping и maxBy из Collectors, можно подойти к решению с разных сторон)
6. Соберите все названия продуктов в одну строку, разделив запятой
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = Arrays.asList(
                new Product(3.5, "Apple", Category.FRUIT),
                new Product(1.2, "Potato", Category.VEGETABLE),
                new Product(5.5, "Pork", Category.MEET),
                new Product(1.8, "Bread", Category.GROCERY),
                new Product(2.5, "Milk", Category.GROCERY),
                new Product(6.0, "Dog food", Category.PET_PRODUCT),
                new Product(3.0, "Orange", Category.FRUIT)
        );
        Shop shop1 = new Shop("Shop 1", "Address 1", 20, products1);

        List<Product> products2 = Arrays.asList(
                new Product(2.5, "Banana", Category.FRUIT),
                new Product(2.2, "Cucumber", Category.VEGETABLE),
                new Product(4.5, "Beef", Category.MEET),
                new Product(2.0, "Bread", Category.GROCERY),
                new Product(2.5, "Butter", Category.GROCERY),
                new Product(7.0, "Cat food", Category.PET_PRODUCT)
        );
        Shop shop2 = new Shop("Shop 2", "Address 2", 18, products2);

        List<Product> products3 = Arrays.asList(
                new Product(2.5, "Pear", Category.FRUIT),
                new Product(1.5, "Tomato", Category.VEGETABLE),
                new Product(3.5, "Chicken", Category.MEET),
                new Product(2.0, "Milk", Category.GROCERY),
                new Product(1.5, "Sugar", Category.GROCERY),
                new Product(6.0, "Fish food", Category.PET_PRODUCT),
                new Product(3.5, "Apple", Category.FRUIT)
        );
        Shop shop3 = new Shop("Shop 3", "Address 3", 21, products3);

        /*
        1. Нужно пройтись по всем продуктам из всех магазинов и заполнить мапу - название продукта ключ, значение цена,
если будут дубликаты - необходимо вывести меньшую стоимость и сообщить о дубликате. соберите значения в
         */
        System.out.println("---1---");
        System.out.println("1. Нужно пройтись по всем продуктам из всех магазинов и заполнить мапу - название продукта ключ, значение цена,\n" +
                "если будут дубликаты - необходимо вывести меньшую стоимость и сообщить о дубликате. соберите значения в");

        Map<String, Double> hashMap = Stream.of(shop1, shop2, shop3)
                .flatMap(shop -> shop.productList().stream())
                .collect(Collectors.toMap(Product::name, Product::price, (f, s) -> {
                            System.out.println("Duplicate: " + f + " and " + s);
                            return f < s ? f : s;
                        }
                ));

        System.out.println(hashMap);

        Map<String, Double> treeMap = Stream.of(shop1, shop2, shop3)
                .flatMap(shop -> shop.productList().stream())
                .collect(Collectors.toMap(Product::name, Product::price, (f, s) -> {
                            System.out.println("Duplicate: " + f + " and " + s);
                            return f < s ? f : s;
                        }, TreeMap::new
                ));

        System.out.println(treeMap);

        /*
        2. Необходимо пройтись по всем магазинам, которые работают после 18 и выбрать фрукты с ценой меньше 5 евро,
        cгруппировать по имени
         */
        System.out.println("---2---");
        System.out.println("2. Необходимо пройтись по всем магазинам, которые работают после 18 и выбрать фрукты с ценой меньше 5 евро,\n" +
                "        cгруппировать по имени");

        Map<String, List<Double>> productsLessThenFive = Stream.of(shop1, shop2, shop3)
                .filter(v -> v.workTo() > 18)
                .flatMap(v -> v.productList().stream())
                .filter(v -> v.price() < 5)
                .collect(Collectors.groupingBy(Product::name, Collectors.mapping(Product::price, Collectors.toList())));

        System.out.println(productsLessThenFive);

        /*
        3. Необходимо посчитать сколько товаров есть по категориям (скажем FRUIT - 3, GROCERY -2...), подсказка используйте
groupingBy и Collectors.counting()
         */
        System.out.println("---3---");
        System.out.println("3. Необходимо посчитать сколько товаров есть по категориям");
        System.out.println(Stream.of(shop1, shop2, shop3)
                .flatMap(v -> v.productList().stream())
                .collect(Collectors.groupingBy(Product::category, Collectors.counting())));

        /*
        4. Необходимо сгруппировать по категориям и вывести названия продуктов в каждой категории
        */
        System.out.println("---4---");
        System.out.println("4. Необходимо сгруппировать по категориям и вывести названия продуктов в каждой категории");
        System.out.println(Stream.of(shop1, shop2, shop3)
                .flatMap(v -> v.productList().stream())
                .collect(Collectors.groupingBy(Product::category, Collectors.mapping(Product::name, Collectors.toSet()))));

        /*
        5. Необходимо сгруппировать по категориям и вывести наименьшую цену продукта в каждой категории (тут нужно например
к значению применить и mapping и maxBy из Collectors, можно подойти к решению с разных сторон)
        */
        System.out.println("---5---");
        System.out.println("5. Необходимо сгруппировать по категориям и вывести наименьшую цену продукта в каждой категории");

        System.out.println(Stream.of(shop1, shop2, shop3)
                .flatMap(v -> v.productList().stream())
                .collect(Collectors.groupingBy(Product::category, Collectors.mapping(Product::price, Collectors.minBy(Comparator.naturalOrder())))));

        /*
        6. Соберите все названия продуктов в одну строку, разделив запятой
         */
        System.out.println("---6---");
        System.out.println("6. Соберите все названия продуктов в одну строку, разделив запятой");

        System.out.println(Stream.of(shop1, shop2, shop3)
                .flatMap(v -> v.productList().stream())
                        .distinct()
                .map(Product::name)
                .collect(Collectors.joining(", ")));
    }
}
