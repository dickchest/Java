package JavaConsultations._2023_05_20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class VoidExTest {
    private List<Integer> list = new LinkedList<>();
    private final VoidEx voidEx = new VoidEx(list);

    @BeforeEach
    void setUp(){
        list.clear();
    }

    @Test
    void safe() {
        voidEx.save(1);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    void delete() {
        voidEx.save(1);
        voidEx.delete(1);
        Assertions.assertEquals(0, list.size());
    }
}