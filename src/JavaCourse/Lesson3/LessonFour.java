package JavaCourse.Lesson3;

public class LessonFour {
    public static void main(String[] args) {
        /**
        * сейчас я попытаюсь инициализировать 8 переменных
         */
        boolean bl = true; // может быть тру или фалз
        char ch = 'd'; // чак нужен для того чтобы обозначить отдельные симовлы
        /*
        сейчас я перечислю все остальные примитивные типиы
        данных ява, кони относятся к числам
        */
        byte bt = 10; // занимает 8 бит - от -128 до 127
        short s = 20; // занимает 16 бит. от -32768 до 32767
        int i = 30; // занимает 32 бита. от - 2,147,483,648 до 2,147,483,648
        long l = 40l; // нужно для того, что бы джава, что это тип лонг -9 223 372 036 854 775 808

        float f = (float) (1.0 / 3f); // 32 бита. ф нужен для того, чтобы показать яве, что это тип флое
        double d = 1.0 / 3; // 64 бита

        System.out.println(f);
        System.out.println(d);
    }
}
