package JavaProfessionalCourseHomeWork.HomeWork15.Level1;

import java.util.Random;
/*
5. Эта задача никак не связана с immutable. Вы работаете на станции слежения за подземными толчками.
Толчки магнитудой до 3 пунктов вас не интересуют. Ваш рабочий день заканчивается, когда со станции
управления приходит сигнал - число -97. Вам необходимо понять, было ли за время вашего дежурства что-то странное.
Если за время вашего дежурства было зафиксировано не менее 5 толчков сильнее 3 пунктов - их нужно написать
в консоль и сообщить о возможном землетрясении. Иначе не писать ничего
 */

public class Exercise5 {
    public static void main(String[] args) {
        // рандомно создаем сигналы

        Random random = new Random();
        int earthquake = 0;
        int earthquakeCount = 0;
        int endOfShift = 0;
        
        while (endOfShift != 97) {
            earthquake = random.nextInt(10);
            if (earthquake > 3)
                earthquakeCount++;

            endOfShift = random.nextInt(100);
        }

        if (earthquakeCount > 5) {
            System.out.println("Возможно землетрясение! Количество толчков больше 3 = " + earthquakeCount);
        }
    }
}
