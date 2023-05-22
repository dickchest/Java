package JavaConsultations._2023_05_20;

import java.util.LinkedList;
import java.util.List;

public class VoidEx {
    List<Integer> list = new LinkedList<>();

    public VoidEx(List<Integer> list) {
        this.list = list;
    }

    public void save(Integer integer) {
         list.add(integer);
    }

    public void delete(Integer integer) {
        if (!list.contains(integer)) {
            throw new NullPointerException();
        } else {
            list.remove(integer);
        }
    }
}
