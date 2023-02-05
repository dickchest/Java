package JavaCourse.Lesson7.SatrudayExternal;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        /*
        из каких частей создается стрим
        их 3.
        есть массив данных и его надо обработать стримом
        1 часть создаем стрим
        2 часть используем интермидиейт оператор для обработки
        3 часть терминальный оператор для закрытия стрима
         */
        int[] ints = {98, 07, 66, 877, 2, 98, 3, 748, 2, 34};
        int[] arr = Arrays.stream(ints)
                //.map(el->el*10)
                .filter(el-> el %2 == 0)
                .toArray();
        System.out.println(Arrays.toString(arr));
        /*
        параллельные стри
        идут параллельно
         */

    }

}
