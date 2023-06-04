package JavaConsultations.saturday._2023_06_03;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        java.util.concurrent.Phaser phaser = new java.util.concurrent.Phaser(2);

        new Washer(phaser);
        new Washer(phaser);

    }
    static class Washer extends Thread {
        Phaser phaser;

        public Washer(java.util.concurrent.Phaser phaser) {
            this.phaser = phaser;
            this.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + "Wash");
                phaser.arriveAndAwaitAdvance() ;
            }
        }

    }

}
