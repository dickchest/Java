package JavaProfessionalCourse.Lesson16_Record;

import java.util.Objects;

public record Key(int age, String name) {
//    public Key {
//        if (name.length() < 3) {
//            System.out.println("short name");
//        }
//    }


    public Key(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void test() {
        System.out.println("test me");
    }

}
