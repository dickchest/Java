package JavaProfessionalCourse.Lesson2_extendtion;

public class TestShapes {

    public static void main(String[] args) {

        Circle1 circle = new Circle1();
        circle.color = "Green";
        circle.radius = 2;
        circle.setSize(3);

        Triangle1 triangle = new Triangle1();
        triangle.color = "Red";
        triangle.firstSide = 3;
        triangle.secondSide = 4;
        triangle.thirdSide = 5;
        triangle.setSize(5);

//        Circle simpleCircle = new Circle("Green", 2, 3);

        Square1 square = new Square1();
        square.color = "Yellow";
        square.setSize(7);
        square.width = 4;

        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(square.toString());

        System.out.println(circle instanceof Object);
        System.out.println(circle instanceof Shape1);
        System.out.println(circle instanceof Dot1);


//        Shape shape = new Shape(); // нельзя создать обект абтсрактного класса



    }
}
