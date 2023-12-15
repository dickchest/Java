package BookJavaChallanges;

public class Exercise1_4_2 {
    public static void main(String[] args) {
        System.out.println(reverseString("12345"));
    }

    static String reverseString(final String input) {
        // basic condition
        if (input.length() == 1) {
            return input;
        }
        final char firstChar = input.charAt(0);
        final String remaining = input.substring(1);

        // recursive descent
        return reverseString(remaining) + firstChar;
    }
}
