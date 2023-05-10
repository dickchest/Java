package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_3_junior;
/*
блоки catch должны идти в порядке от конкретного к общему.
Это связано с тем, что если исключение уже обработано в более
конкретном блоке catch, то оно не будет обработано в более общем блоке.
 */
public class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
