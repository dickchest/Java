package JavaCourse.Lesson10_Massives;

public class Five {
    public static void main(String[] args) {
        // создайте массив от 1 до 99 из всех нечетных числе,
        // выведите его в строку в обратном порядке

        int notEvenCounter = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                notEvenCounter += 1;
            }
        }
        int[] notEvenDigitsArray = new int[notEvenCounter];

        int j = 0;
        int lastNotEven = 1;
        for (int i = 0; i < notEvenDigitsArray.length; i++) {
            notEvenDigitsArray[i] = lastNotEven;
            lastNotEven += 2;
        }

        for (int i = notEvenDigitsArray.length-1; i > 0 ; i--) {
            System.out.println(notEvenDigitsArray[i]);
        }

    }
}
