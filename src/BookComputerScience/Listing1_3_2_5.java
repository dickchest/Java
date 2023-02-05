package BookComputerScience;

public class Listing1_3_2_5 {
    public static void main(String[] args) {
        int i=0;
        while (i < 33) {
            System.out.printf("%d    %d\n", i, (int) Math.pow(2, i));
            ++i;
        }
    }
}
