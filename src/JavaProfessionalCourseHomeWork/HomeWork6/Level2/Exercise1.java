package JavaProfessionalCourseHomeWork.HomeWork6.Level2;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    /*
    1. Дан List названий товаров, выпускаемых заводом. Определите, повторяется ли в этом Lis название первого товара,
    и, если повторяется, удалите все названия первого товара из List.
     */
    public static void main(String[] args) {
        List<String> goodsName = new ArrayList<>();

        // заполняем элементами с повторениями
        for (int i = 0; i < 50; i++) {
            if (i == 0 || i == 10 || i == 20 || i == 30) goodsName.add("Item #0");
            else goodsName.add("Item #" + i);
        }

        for (int i = 0; i < goodsName.size(); i++) {
                if (goodsName.get(i).equals("Item #0")) {
                    System.out.println("Обект найден в месте " + i);
                    goodsName.remove(i);
                }
        }

        System.out.println(goodsName);
    }
}
