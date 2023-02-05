package JavaCourse.Lesson6;

public class LessonSeven4 {
    public static void main(String[] args) {
        double m = 28.12;
        double n = 14.87;

        int a = 10;

        double substractedM = Math.abs(a - m);
        double substractedN = Math.abs(a - n);

        System.out.println(substractedM + substractedM);

        if (substractedM == substractedN) {
            System.out.println("Both digits equil");
        }
        if (substractedM > substractedN) {
            System.out.printf("Число %.2f ближе к число 10 чем число %.2f", substractedN, substractedM);
        }
        if (substractedM < substractedN) {
            System.out.printf("Число %.2f ближе к число 10 чем число %.2f", substractedM, substractedN);
        }



    }
}
