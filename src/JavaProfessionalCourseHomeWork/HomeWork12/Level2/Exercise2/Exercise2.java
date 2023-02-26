package JavaProfessionalCourseHomeWork.HomeWork12.Level2.Exercise2;

import java.util.*;

/*
2. Дан лист из 1000 чисел (заполните его от 1 до 1000 и размешайте его -
запустите метод Collections.shufle(..)), необходимо найти пары чисел которые
в сумме дают число k (сгенерируйте рандомом) Рандомом генерируйте числа
от 0 до 1000
 */
public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>(1000);
        Integer k = random.nextInt(1000);

        System.out.println("k = " + k);

        // заполняем лист значениями
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        // перемешиваем список
        Collections.shuffle(list);

        // находим пары
        /*
        можно найти пары двумя вложенными циклами и полным перебором,
        но лучше, наверное изначально исключить неподходящие варианты
        и ипользовать только 1 цикл
         */
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            // сначала создадим хешмеп с числами, которые могут быть суммой k

            if (list.get(i) == null || list.get(i) > k) {
                list.set(i, null);
                continue;
            }

            Integer x = k - list.get(i);

            // если пара существует, то создаем мапу с парой параметров
            if (list.indexOf(x) != -1) {
                // проверяем, если это не один и тот же элемент
                if (list.indexOf(x) == i) {
                    continue;
                }
                pairs.put(list.get(i), x);
                // обнуляем элементы, что бы не было повторных пар
                list.set(i, null);

                list.set(list.indexOf(x), null);
            }
        }

        System.out.println(pairs);
        System.out.println("Количетсво пар: " + pairs.size());

    }
}
