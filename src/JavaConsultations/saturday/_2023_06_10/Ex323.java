package JavaConsultations.saturday._2023_06_10;
/*
посчитать количество единичек в числе
 */
public class Ex323 {
    public static int getONEs(int n) {

        // ob00000011 == 3
        // ob00000010 == 2
        // ob00000001 == 1
        int result = 0;
        while(n != 0) {
            n = n & (n-1); // n = 3 & 2
            result++; // |
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 0b00000011;
        int r = 0b00001011;

        System.out.println(getONEs(i));
        System.out.println(getONEs(r));
        System.out.println(Integer.toBinaryString(29));

    }
}
