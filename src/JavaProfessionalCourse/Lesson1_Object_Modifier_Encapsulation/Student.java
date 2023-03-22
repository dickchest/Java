package JavaProfessionalCourse.Lesson1_Object_Modifier_Encapsulation;

public class Student {
    private String name;
    private int age;

    private boolean rich;

// конструктор класса
    public Student() {}; // конструктор по умолчинаю

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    // метод класса
    public void sayHello() {
        System.out.println("Say Hallo!");
    }

    // геттеры и сеттеры
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void inviteToBirthday() {
        incrementsAge();
        System.out.println("Happy birthday, " + this.name);
    }

    private void incrementsAge() {
        this.age += 1;
    }

    public boolean isRich() {
        return rich;
    }

    // сигнатура метода

//    int test() {
//        return 1;
//    }
//
//    void test() {}
//
//    int test(int val) {
//        return 1;
//    }
//
//    void test(int val) {
//    }
}
