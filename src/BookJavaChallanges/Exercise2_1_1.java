package BookJavaChallanges;

public class Exercise2_1_1 {
    public static void main(String[] args) {
        extractingTheNumbers(123);
        countDigit(123);
    }

    private static void countDigit(int number) {
        int count = 0;
        int remainingNumber = number;

        while (remainingNumber > 0) {
            remainingNumber = remainingNumber / 10;
            count++;
        }

        System.out.println(count);
    }

    static void extractingTheNumbers(int startValue) {
        int remainingValue = startValue;
        while (remainingValue > 0) {
            final int digit = remainingValue % 10;
            System.out.print(digit + " ");
            remainingValue = remainingValue / 10;
        }
        System.out.println();
    }
}
