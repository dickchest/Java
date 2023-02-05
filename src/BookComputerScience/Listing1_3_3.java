package BookComputerScience;

public class Listing1_3_3 {
    public static void main(String[] args) {
        int n=9;
        int power = 1;
        int i=0;
        while (power <= n / 2) {
            power = 2 * power;
            System.out.printf("%d = %d\n", i, power);
            ++i;
        }
    }
}
