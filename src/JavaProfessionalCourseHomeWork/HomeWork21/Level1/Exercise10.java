package JavaProfessionalCourseHomeWork.HomeWork21.Level1;

import java.util.List;

/*
10. Государство пытается сдержать цену на хлеб, создайте метод, который будет проверять цену хлеба
и если он больше 8 евро, то будет выкидывать Exception(желательно создать свой Exception)
с сообщением хлеб слишком дорой
 */
public class Exercise10 {
    public static void main(String[] args) throws PriceIsToHighException {
        List<Integer> breads = List.of(12, 7, 6, 15, 9, 1, 3);

        for (Integer price : breads) {
            buyBread(price);
        }
    }

    private static void buyBread(Integer price) throws PriceIsToHighException {
        if (price > 8) {
            throw new PriceIsToHighException("хлеб слишком дорогой");
        }
    }

}
