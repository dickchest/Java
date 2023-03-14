package JavaProfessionalCourse.Lesson12_Map_HashCode_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CopyTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Cat cat = new Cat(3, "Tom");
        Cat tom = new Cat(cat.getAge(), "Tom");
        cat.setToy(new Toy("pogremushka"));
        Cat tom1 = (Cat) cat.clone();
        tom1.getToy().setName("pogrom");
        tom.setAge(cat.getAge());
        tom.setName(cat.getName());

        System.out.println(cat);

        System.out.println(tom);
        System.out.println(tom1);

        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Toy test = new Toy("test");
        Toy test2 = new Toy("test");
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());

        Map<Cat, Toy> catToyMap = new HashMap<>();
        catToyMap.put(cat2, test);
        catToyMap.put(cat3, test2);

    }
}
