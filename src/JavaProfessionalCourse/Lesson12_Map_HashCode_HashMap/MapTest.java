package JavaProfessionalCourse.Lesson12_Map_HashCode_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Petya", "живет через улицу");
        map.put("Вася", "живет по сосоедству");
        map.put("Даша", "живет через улицу");
        map.put("Маша", "живет на соседней улицу");

        System.out.println(map);


    }

}
