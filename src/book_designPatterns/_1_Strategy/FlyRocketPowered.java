package book_designPatterns._1_Strategy;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
