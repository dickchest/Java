package JavaCourse.Lesson5;

public class LessonFive {

    public static void main(String[] args) {
        // тип_обекта  название_обекта  оператор_присваивания New_ключевое_слово класс_обекта (переменные конструктор)
        Alice alice = new Alice("ivanova");
        System.out.println(alice.surname);
        alice.setSurname("Petrova");
        System.out.println(alice.surname);

        Bob bob = new Bob();
        bob.getFood();

        CalculatorClassWork calculator = new CalculatorClassWork();
        int sum = calculator.sum(1,2);//        // int sum = 3;
        int substract = calculator.substract(1, 2);

        try {
            int divide = calculator.divide(10, 1);
            System.out.println(divide);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("divided by zero!");
        }


        System.out.println(sum);
        System.out.println(substract);
//         System.out.println(divide);
//        String string = calculator.getString();
//        System.out.println(string);

        int min = Math.min(12,64);
        System.out.println(min);

        //

        MyObject myObject = new MyObject();
        myObject.methodObject();

        MyObject.methodStatic();

        int sum1 = CalculatorClassWork.sum1(1,2);
        System.out.println(sum1);
    }
}
