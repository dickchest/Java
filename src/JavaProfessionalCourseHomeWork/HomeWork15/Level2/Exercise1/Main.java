package JavaProfessionalCourseHomeWork.HomeWork15.Level2.Exercise1;

/*
1. Есть Человек(Фамилия и имя), Оплата(вид оплаты(карта или кеш), сумма оплаты),
Счет(сумма счета, кто оплатил, оплата) Необходимо реализовать структуру для
хранения этих данных - Оплата и Счет должны быть immutable
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Invoice invoice1 = new Invoice(new Person("Ivan", "Ivanov"), new Bill("Card", 100.05));
        Invoice invoice2 = new Invoice(new Person("Volodymyr", "Volodov"), new Bill("Cash", 2500.99));
    }
}
