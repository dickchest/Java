package BookComputerScience;

// проведение эксперементов начинаются с искохдной суммы стейк и завершаются 0 или голлом
public class Listing1_3_8 {
    public static void main(String[] args) {
        int stake = 500;
        int goal = 2500;
        int trials = 1000;
        int bets = 0;
        int wins = 0;
        for (int i = 0; i < trials; i++) {
            int cash = stake;

            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            if (cash == goal) wins++;
//            System.out.println("Bets: " + bets + "; cash: " + cash);
        }
        System.out.println("wins = " + wins);
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);

        System.out.println("по теории вероятности вероятность успеха = " + (double) stake / goal);
        System.out.println("количество ставок = " + stake * (goal - stake));
    }
}
