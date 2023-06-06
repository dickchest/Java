package book_designPatterns._1_Strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
