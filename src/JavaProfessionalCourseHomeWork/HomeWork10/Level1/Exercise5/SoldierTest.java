package JavaProfessionalCourseHomeWork.HomeWork10.Level1.Exercise5;

/*
5. Солдаты всегда строились, строятся и будут строиться по убыванию роста.
Отсортируй солдат, предварительно подумав, что лучше использовать при таких условиях - Comparable или Comparator.
Реализовать класс Soldier. Можно с одним полем - рост. Создать коллекцию солдат и отсортировать ее.
Что Вы используете - Comparable или Comparator - выбирать Вам, но нужно объяснить свой выбор.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoldierTest {
    public static void main(String[] args) {

        List<Soldier> soldiers = new ArrayList<>();

        soldiers.add(new Soldier(178));
        soldiers.add(new Soldier(172));
        soldiers.add(new Soldier(185));
        soldiers.add(new Soldier(193));
        soldiers.add(new Soldier(193));
        soldiers.add(new Soldier(168));
        soldiers.add(new Soldier(175));

        Collections.sort(soldiers);

        System.out.println(soldiers);
    }
}
