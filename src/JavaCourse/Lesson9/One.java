package JavaCourse.Lesson9;

public class One {
    public static void main(String[] args) {
        int a = 0;

        while (a < 10) {
            System.out.println(a);
            a++;
        }

        int x = 1, sum = 0;

        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("Simulation: " + sum);


        int a1 = 0;

        do {
            System.out.println(a1);
        } while (a1>12);
    }
}
