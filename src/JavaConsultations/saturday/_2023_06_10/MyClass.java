package JavaConsultations.saturday._2023_06_10;
/*
двоичная система
побитовые операции работают очень сильно быстро. самая быстрая операция
очень много побитовых операций находится в джаве в разных классах
ПОБИТОВЫЕ ОПЕРАЦИИ:
& побитовое и
| побитовое или
>> << побитовые сдвиги
>>> <<< тоже побито сдвиги другого порядка

 */
public class MyClass {
    static int b = 3;
    static int bb = 0b11100011;

    public int getONE(int n) {
        int result = 0;
        // код
        return result;
    }

    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }
    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1);
    }


    public static void main(String[] args) {
        int i = 0b00000100; // 4
        // 000000000
        System.out.println(i);

        // как вывести на экран в двоичном виде
        System.out.println(Integer.toBinaryString(i));

        // сдвиг влево
        // 0100 --> 1000 --> 8 -- умножение на 2
        System.out.println(i << 1);

        // сдвиг вправо
        // 0100 --> 0010 --> 2 -- деление на 2
        System.out.println(i >> 1);

        //
        int  a =0b00001001;
        int  b =0b00001010;
        System.out.println("Побитовое AND");
        printBinary(a);
        printBinary(b);
        printBinary(a & b);
        System.out.println("******************************");

        System.out.println("Побитовое OR");
        printBinary(a);
        printBinary(b);
        printBinary(a | b);
        System.out.println("******************************");

        System.out.println("Побитовое XOR ^");
        printBinary(a);
        printBinary(b);
        printBinary(a ^ b);
        System.out.println("******************************");

        System.out.println("инверсия NOT ~");
        printBinary(a);
        printBinary(b);
        printBinary(~a);
        System.out.println("******************************");
    }
}
