package BookComputerScience.HomeWork;

/*
1.2.20. Напишите программу, которая выводит сумму двух случайных чисел от 1 до
6 (такие результаты могут быть получены при броске кубиков).
 */
public class HomeWork1_2_20 {
    public static void main(String[] args) {
        int a, b;
        int[] count = new int[7];
        for (int i = 0; i < 400; i++) {
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            count[a] += 1;
            count[b] += 1;
            System.out.println(a + " + " + b + " = " + (a+b));
        }
        for (int i = 1; i < count.length; i++) {
            System.out.println(i + " = " + count[i]);
        }
    }
}
