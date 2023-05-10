package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_1_intern.Task_5;
/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */
public class ExceptionDemo{
    public static void main(String[] args) throws Exception {
        Exception e1 = new Exception();
        System.out.println("Exception 1: " + e1);

        Exception e2 = new Exception("Сообщение об ошибке2");
        System.out.println("Exception 2: " + e2);

        Exception e3 = new Exception("Сообщение об ошибке3", new Throwable());
        System.out.println("Exception 3: " + e3);
    }
}
