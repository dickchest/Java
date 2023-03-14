package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise9;

import java.util.HashMap;
import java.util.Map;
/*
9. Напишите класс Database (который в качестве хранения использует Map<K,V>),
база должна быть параметризована двумя параметрами - ключ и значение,
ограничение - ключ должен быть наследником Number
 */


public class Database<K extends Number, V> {
    private Map<K, V> data;

    public Database() {
        data = new HashMap<>();
    }

    public void add(K key, V value) {
        data.put(key, value);
    }

    public V get(K key) {
        if (data.get(key) == null)
        {
            System.out.println("Key Not found");
            return null;
        }
        return data.get(key);
    }
}
