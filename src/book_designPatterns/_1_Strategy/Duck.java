package book_designPatterns._1_Strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public Duck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }


    public void swim() {
        System.out.println("All duck float, even decoys!");
    }
}
