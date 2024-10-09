package book_designPatterns._8_TemplateMethod._1_barista;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
