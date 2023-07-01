package YouTubeChannel.multiThreading.waitNotify;

import java.util.ArrayList;

public class waitExample {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();

        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Runnable task = blockingQueue.get();
                    task.run();
                }
            }
        });

        worker.start();

        for (int i = 0; i < 10; i++) {
            blockingQueue.put(getTask());
        }
    }

    public static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    static class BlockingQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();
        public synchronized Runnable get() {
            while (tasks.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Runnable task = tasks.get(0);
            tasks.remove(0);
            return task;
        }

        public synchronized void put(Runnable task) {
            tasks.add(task);
            notify();
        }
    }
}
