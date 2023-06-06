package JavaRush;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.Phaser;

public class ExecutionOrderDemo {
    private static class A {
        int x = 0;
    }

    private static final A sharedData1 = new A();
    private static final A sharedData2 = new A();

    public static void main(String[] args) {
        var phaser = new Phaser(3);
        var t1 = new Thread(() -> {
            phaser.arriveAndAwaitAdvance();
            var l1 = sharedData1;
            var l2 = l1.x;
            var l3 = sharedData2;
            var l4 = l3.x;
            var l5 = l1.x;
            System.out.println("Thread 1: " + l2 + ", " + l4 + ", " + l5);
        });

        var t2 = new Thread(() -> {
            phaser.arriveAndAwaitAdvance();
            var l6 = sharedData1;
            l6.x = 3;
            System.out.println("Thread 2: " + l6.x );
        });

        t1.start();
        t2.start();
        phaser.arriveAndDeregister();
    }

}
