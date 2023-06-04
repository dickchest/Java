package Algorithms.lesson9_GreedyAlgorithms.homework;

import java.util.*;

/*
Предположим, у вас есть рюкзак вместимостью 10 кг и список предметов, которые вы
можете положить в рюкзак. Каждый предмет имеет свой вес и стоимость:
Предмет Вес (кг) Стоимость ($)
1 2 10
2 3 15
3 5 25
4 7 35
Вам нужно выбрать такой набор предметов, чтобы их суммарный вес не превышал 10 кг, а суммарная
стоимость была максимальной.
 */
public class Level2 {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item(2,10));
        items.add(new Item(3,15));
        items.add(new Item(5,25));
        items.add(new Item(7,35));

        int capacity = 10;

        List<Item> selected = selectionOfItems(items, capacity);
        // вывод на экран
        System.out.println("Selected items:");
        for (Item item : selected) {
            System.out.println("Weight: " + item.weight + ", Price: " + item.price);
        }
    }

    public static List<Item> selectionOfItems(List<Item> items, int capacity) {
        // вычисляем ценность каждого предмета


        Collections.sort(items, (a,b) -> Double.compare((double) b.price / b.weight, (double) a.price / a.weight));

        List<Item> selectedItems = new ArrayList<>();

        for (Item item : items) {
            if (item.weight<=capacity) {
                selectedItems.add(item);
                capacity -= item.weight;
            }
        }

        return selectedItems;
    }

}

class Item {
    int weight;
    int price;

    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
}
