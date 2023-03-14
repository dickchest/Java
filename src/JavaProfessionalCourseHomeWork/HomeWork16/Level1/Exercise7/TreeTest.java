package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise7;

import JavaProfessionalCourseHomeWork.HomeWork13.Level2.Tree;

public class TreeTest {
    public static void main(String[] args) {
        TreeGeneric <String> str = new TreeGeneric<>();
        str.addRoot("root");
        str.addChild("child1");
        str.addChild("child2");
        str.addChild("child3");
        str.print();
    }
}
