package JavaCourse.Lesson4;

import java.util.Scanner;

public class LessonFive {
    public static void main(String[] args) {
//        String str = new String("sdfsdf");
        Scanner scanner = new Scanner(System.in);
        Cat vasya = new Cat();
        Cat petya = new Cat(12, "red");
        Cat shurik = new Cat("white");

        System.out.println(vasya.toString());
        System.out.println(petya.toString());
        System.out.println(shurik.toString());

//        vasya.age = 3;
//        petya.age = 12;
//        vasya.colour = "white";
//        petya.colour = "red";
//
//        vasya.colour = "black";

//        System.out.printf("Vasya is %s %d years old cat", vasya.colour, vasya.age);
//        System.out.printf("Petya is %s %d years old cat", petya.colour, petya.age);


        Phone pixelSeven = new Phone("Google", 256, 5000, 5.5, "type-C");
        Phone nokia3310 = new Phone("Nokia", 1, 500, 1.7, "Nokia connctor");
        Phone iphone = new Phone("Apple", 123, 5500, 5.7, "lightning");


    }
}
