package book_designPatterns._1_Strategy;

public class MuteDuck implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
