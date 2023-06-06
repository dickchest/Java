package book_designPatterns._1_Strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("кря-кря!!!");
    }
}
