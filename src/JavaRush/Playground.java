package JavaRush;
/*
2. Количество Java-потоков ограничено
Создать поток в Java легко. Однако это не означает, что мы можем создавать их сколько угодно. Количество потоков ограничено.
Мы можем легко узнать, сколько потоков мы можем создать на конкретной машине с помощью следующей программы:
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class Playground {
    public static void main(String[] args) {
        var counter = new AtomicInteger();

        while (true) {
            new Thread(() -> {
                int count = counter.incrementAndGet();
                System.out.println("thread count = " + count);
                LockSupport.park();
            }).start();
        }
    }
}
