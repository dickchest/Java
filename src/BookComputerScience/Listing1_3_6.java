package BookComputerScience;

public class Listing1_3_6 {
    public static void main(String[] args) {
        double c = 2;
        double EPSILON = 1e-15;
        double t = c;
        System.out.println(EPSILON * t);
        while (Math.abs(t-c/t) > EPSILON * t) {
            t=(c/t + t) / 2.0;
            System.out.println(t);
        }
        System.out.println(t);
    }
}
