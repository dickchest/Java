package book_designPatterns._8_TemplateMethod._2_sort;

import org.jetbrains.annotations.NotNull;

public class Duck implements Comparable{

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(@NotNull Object object) {
        Duck otherDuck = (Duck) object;

        if (this.weight < otherDuck.weight) return -1;
        else if (this.weight == otherDuck.weight) return 0;
        else return 1;
    }
}
