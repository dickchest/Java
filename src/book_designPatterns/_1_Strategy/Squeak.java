package book_designPatterns._1_Strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("пи-пи-пи!!!");
    }
}
