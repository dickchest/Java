package JavaCourse.Lesson8;

public class Two {
    // вложенный цикл
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.printf("i = %d, j = %d\n", i, j);
            }
        }
    }
}
