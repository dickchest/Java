package BookJavaChallanges;

public class Exercise1_4_3 {
    public static void main(String[] args) {
        System.out.println(countSubstrings("XXXX", "XX"));
    }

    static int countSubstrings(final String input, final String valueToFind) {
        // recursive basic function
        if (input.length() < valueToFind.length())
            return 0;

        int count = 0;

        String remaining;

        // does the text start with the search string?
        if (input.startsWith(valueToFind)) {
            remaining = input.substring(valueToFind.length());
            count = 1;
        } else {
            // remove first character
            remaining = input.substring(1);
            count = 0;
        }
        return countSubstrings(remaining, valueToFind) + count;
    }
}
