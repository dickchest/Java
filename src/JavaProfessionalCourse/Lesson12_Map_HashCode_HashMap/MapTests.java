package JavaProfessionalCourse.Lesson12_Map_HashCode_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapTests {
    public static void main(String[] args) {
        Map<String, String> fromToMap = new HashMap<>();
        fromToMap.put("Berlin", "London");
        fromToMap.put("Tokyo", "Seul");
        fromToMap.put("Mumbai", "Berlin");
        fromToMap.put("Seul", "Mumbai");

        String toCity = fromToMap.get("Tokyo");
        while (fromToMap.containsKey(toCity)) {
            System.out.println(toCity);
            toCity = fromToMap.get(toCity);

        }
        System.out.println(toCity);
    }

}
