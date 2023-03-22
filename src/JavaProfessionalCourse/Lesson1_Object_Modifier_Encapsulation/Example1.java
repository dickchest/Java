package JavaProfessionalCourse.Lesson1_Object_Modifier_Encapsulation;

public class Example1 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Student vasya = new Student("Vasya", 20);
//        Student petya = new Student("Petya", 19);
////        vasya.name = "Vasya";
////        vasya.age = 20;
//        System.out.println(vasya.getName());
//        System.out.println(vasya.getAge());
//        System.out.println(petya.getName());
//        System.out.println(petya.getAge());
////        vasya.setAge(17);
////        vasya.setName("Вася");
//        vasya.inviteToBirthday();
//        System.out.println(vasya.getAge());
//        petya.sayHello();

        Table bigTable = new Table("Black", "Ikea", "Travensia", 2010);
        Table smallTable = new Table("Ikea", "Small table", 2016);

        bigTable.setColor("White");
        smallTable.setColor("White");

        System.out.println(bigTable.getColor());
        System.out.println(smallTable.getColor());

        smallTable.setColor("Green aquarel");
        bigTable.setColor("Green aquarel");

        System.out.println(smallTable.getColor());
        System.out.println(bigTable.getColor());

        System.out.println(smallTable);

        System.out.println(smallTable);
        System.out.println(bigTable);
    }
}
