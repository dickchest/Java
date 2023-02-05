package JavaCourse.Lesson9;

public class Three {
    public static void main(String[] args) {

        // break
        // continue

        int desireInteger = 700;
        int foundInteger = 0;
        int loopsCount = 0;

        for (int i = 0; i < 25_000; i++) {

            if (i >10 && i < desireInteger) {
                continue;
            }
            System.out.println(i);

            if (i == desireInteger) {
                foundInteger = i;
                break;
            }

            loopsCount += 1;
        }
        System.out.println(foundInteger);
        System.out.println(loopsCount);
    }
}
