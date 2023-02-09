package JavaProfessionalCourseHomeWork.HomeWork7;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        Проверем скорость работы для for/foreach и итератора для этого создать List<Integer>,
        наполнить его 10 миллионами элементами (используйте рандом)

- перед for объявите переменную int tempVal, внутри тела выполнения for/foreach/выполнения итератора кладите
текущую переменную в эту переменную
- перебрать for-each loop
- перебирать с помощью classic for
- classic for, перебираем с конца (i--)
- используя Itertor
- используя ListIterator для всех случаев сделать замер времени результат вывести в консоль (как замерять время
можете посмотреть в предыдущей домашке)

напрмиер:
int temp = 0;
for(int i =0;i<list.size();i++) {
temp = list.get(i);
//не надо тут печатать в консоль, это замедляет работу перебора очень сильно, так как 10 млн/ объектов
}
sout(temp);
         */

        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        int temp = 0;

        // заносим элементы в массив
        for (int i = 0; i < 10_000_000; i++) {
            list.add(random.nextInt(1000));
        }

        long before;
        long after;

        // перебираем for each
        before = System.currentTimeMillis();
        for (Integer tempList : list) {
            temp = tempList;
        }
         after = System.currentTimeMillis();
        System.out.println("For each: " + (after-before));

        // перебираем классическим fori
        before = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }

        after = System.currentTimeMillis();
        System.out.println("Classic For: " + (after-before));

        // перебираем с Iteratorom
        Iterator<Integer> iterator = list.iterator();

        before = System.currentTimeMillis();
        while (iterator.hasNext()) {
            temp = iterator.next();
        }
        after = System.currentTimeMillis();
        System.out.println("Iterator: " + (after-before));


        // перебираем с ListIteratorom
        ListIterator<Integer> listIterator = list.listIterator();

        before = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            temp = listIterator.next();
        }
        after = System.currentTimeMillis();
        System.out.println("ListIterator: " + (after-before));
    }
}
