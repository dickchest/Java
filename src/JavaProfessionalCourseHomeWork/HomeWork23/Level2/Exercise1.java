package JavaProfessionalCourseHomeWork.HomeWork23.Level2;
/*
1. Возьмите файл из предыдущей домашки с результатами матчей, посчитайте сколько символов `,` встретилось в этом файле
 */

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        String fileName = "data/matches.txt";
        long startTime = System.currentTimeMillis();
        try (
                Reader reader = new FileReader(fileName);
        ) {
            int current;
            int count = 0;
            while ((current = reader.read()) != -1) {
                if ((char) current == ',') {
                    count ++;
                }
            }
            System.out.println(count);

            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }
    }
}
