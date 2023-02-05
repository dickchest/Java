package BookComputerScience.HomeWork;
/*
1.2.5. Оператор исключающего OR Л для операндов типа boolean по определению
возвращает true, если операнды различны, и возвращает false, если они совпадают.
Приведите таблицу истинности для этой функции.
 */
public class HomeWork1_2_5 {
    public static void main(String[] args) {
        boolean a, b;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a = i == 0 ? false : true;
                b = j == 0 ? false : true;
                System.out.println("| " + a + " | " + b + " | "  + (a ^ b));
            }
        }
    }
}
