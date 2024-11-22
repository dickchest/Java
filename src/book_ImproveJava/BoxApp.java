package book_ImproveJava;

public class BoxApp {
    public static void main(String[] args) {
        Box box = new Box(100);
        box.width = 20;
        box.height = 10;
        box.depth = 2;

        Box box2 = new Box(101, 10);
        System.out.println("Volume1: " + box.getVolume());
        System.out.println("Volume2: " + box2.getVolume());
    }
}
