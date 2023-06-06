package JavaRush;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/*
Но что, если создать миллионы потоков, и каждый из них будет использовать открытый сокет для взаимодействия с внешним миром?
Это, безусловно, улучшит нашу пропускную способность приложения.

Чтобы поддержать эту идею, в Java существует инициатива под названием Project Loom. Используя ее, мы можем создать миллионы виртуальных потоков.
Например, используя следующий фрагмент кода, я смог создать 4,5 миллиона потоков на своей машине.

У меня не отработала
 */
//public class ProjectLoom {
//    public static void main(String[] args) {
//        var counter = new AtomicInteger();
//
//        // 4_576_279
//        while (true) {
//            Thread.startVirtualThread(() -> {
//                int count = counter.incrementAndGet();
//                System.out.println("thread count = " + count);
//                LockSupport.park();
//            });
//        }
//    }
//}
