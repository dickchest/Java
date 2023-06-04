package JavaConsultations.saturday._2023_06_03;

import java.lang.reflect.Field;
/*
такая технология может применяться, когда будем изучать технологиями связанными с фрейворками и надстройками
напрямую мы ей пользоваться не будем, может быть методы логирования
 */
public class RefEx3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Emp emp = new Emp(1, "Mik", "IT");

        Class empClass = emp.getClass(); // получаем экземпляр класса
        Field field = empClass.getDeclaredField("salary"); // получаем значение поля

        field .setAccessible(true); // устанавливаем приватный класс акссесебл

        double salaryValue = (double) field.get(emp);
        System.out.println(salaryValue);
        System.out.println("************************************************");

        field.set(emp, 3333);
        System.out.println(emp);
        System.out.println("************************************************");


    }
}
