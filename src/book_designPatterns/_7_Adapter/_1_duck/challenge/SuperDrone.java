package book_designPatterns._7_Adapter._1_duck.challenge;

public class SuperDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("Beep!");
    }

    @Override
    public void spinRotors() {
        System.out.println("Spin rotors...");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off!");
    }
}
