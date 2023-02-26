package JavaProfessionalCourseHomeWork.HomeWork12.Level1;

import java.util.HashMap;
import java.util.Map;

/*
5. Дана строка, вывести количество появлений каждого символа в этой строке. Вместо char в мапе используйте обертку Character
Например: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque.";
        char[] chars = string.toCharArray();

        Map<Character, Integer> howManyTimesCharAppear = new HashMap<>();

        for (Character currentCharacter : chars) {
            Integer quantityOfCurrentChar = howManyTimesCharAppear.get(currentCharacter);

            // проверка, символ существует или нет
            if (quantityOfCurrentChar == null) {
                howManyTimesCharAppear.put(currentCharacter, 1);
            } else {
                howManyTimesCharAppear.put(currentCharacter, ++quantityOfCurrentChar);
            }
        }

        // вывод результатов
        for (Character x : howManyTimesCharAppear.keySet()) {
            if (x == ' ') {
                System.out.printf("Символ пробел/space встречается %d раз\n", howManyTimesCharAppear.get(x));
            } else {
                System.out.printf("Символ %s встречается %d раз\n", x, howManyTimesCharAppear.get(x));
            }
        }
    }
}
