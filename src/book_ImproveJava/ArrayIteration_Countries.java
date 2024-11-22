package book_ImproveJava;

import java.util.ArrayList;

public class ArrayIteration_Countries {
    String name;
    String capital;

    public ArrayIteration_Countries(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public static void main(String[] args) {
        ArrayIteration_Countries country1 = new ArrayIteration_Countries("France", "Paris");
        ArrayIteration_Countries country2 = new ArrayIteration_Countries("United States", "Washington");
        ArrayIteration_Countries country3 = new ArrayIteration_Countries("Ukraine", "Kyiv");

        ArrayList<ArrayIteration_Countries> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        countries.forEach(country -> {
            System.out.println(country.name + " " + country.capital);
        });
    }
}
