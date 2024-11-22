package book_ImproveJava.hashMap.ex2_AddDischesToTheMenu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Menu {
    Set<String> dishes = new HashSet<>();

    public void addDishes() {
        dishes.add("Rice");
        dishes.add("Pizza");
        dishes.add("Fish");
        dishes.add("Soup");
        dishes.add("Beef");
    }

    public Set<String> display() {
        return dishes;
    }
}
