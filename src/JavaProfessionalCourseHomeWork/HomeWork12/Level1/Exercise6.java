package JavaProfessionalCourseHomeWork.HomeWork12.Level1;

import java.util.HashMap;
import java.util.Scanner;

/*
6. Однажды Вася решил посмотреть результаты финала чемпионата Берляндии по футболу 1910 года.
К сожалению, он не нашел итоговый счет матча, зато нашел подробное текстовое описание хода всей игры.
Всего в этом описании оказалось n строк, каждая из которых описывала один гол.
Каждый гол обозначался названием забившей его команды. Помогите Васе — узнайте название команды, победившей в финале.
Гарантируется, что матч не закончился вничью.
 */
public class Exercise6 {
    public static void main(String[] args) {
        String description = "Dinamo Kiyv\nChornomorec Odessa\nDinamo Kiyv\nShahtar Donetsk";
        Scanner scanner = new Scanner(description);
        HashMap<String, Integer> goals = new HashMap<>();

        String winner = "";
        int maxGoals = -1;

        while (scanner.hasNext()) {
            String team = scanner.nextLine();
            goals.put(team, goals.getOrDefault(team, 0) + 1);

            // проверка на максимальное кол-во голов
            if (goals.get(team) > maxGoals) {
                maxGoals = goals.get(team);
                winner = team;
            }
        }

        for (String i : goals.keySet()) {
            System.out.println(i + " " + goals.get(i));
        }
        System.out.println("----------");
        System.out.println("Winner is " + winner);
    }
}
