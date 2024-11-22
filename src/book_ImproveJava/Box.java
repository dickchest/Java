package book_ImproveJava;

public class Box {
    int BoxNr;
    double width, height, depth;

    public Box(int boxNr) {
        this.BoxNr = boxNr;
        System.out.println("Box number " + boxNr + " is created!");
    }

    public Box(int boxNr, double side) {
        this(boxNr);
        width = side;
        height = side;
        depth = side;
        System.out.println("Box number " + boxNr + " is created, side length = " + side);
    }

    double getVolume() {
        return width * height * depth;
    }
}

