package book_designPatterns._4_Fabric.pizaSimpleFabric;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
    }
    public void bake(){
        System.out.println("Baking " + name);
    }

    public void cut(){
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        // Code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("----").append(name).append("----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");

        for (String topping : toppings) {
            display.append(topping).append("\n");
        }

        return display.toString();
    }
}
