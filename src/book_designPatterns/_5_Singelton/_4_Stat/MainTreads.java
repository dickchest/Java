package book_designPatterns._5_Singelton._4_Stat;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainTreads {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Будем запускать цикл, пока не найдем разные экземпляры
        boolean isDifferentInstancesFound = false;
        int attempt = 0;

        while (!isDifferentInstancesFound) {
            attempt++;
            System.out.println("Attempt #" + attempt);

            // Создаем две задачи для потоков
            Callable<SingletonTest> task1 = new SingletonCallable();
            Callable<SingletonTest> task2 = new SingletonCallable();

            try {
                // Запускаем задачи и получаем результат
                Future<SingletonTest> future1 = executor.submit(task1);
                Future<SingletonTest> future2 = executor.submit(task2);

                // Получаем экземпляры Синглтона
                SingletonTest singleton1 = future1.get();
                SingletonTest singleton2 = future1.get();

                // Проверяем, разные ли экземпляры
                if (singleton1 != singleton2) {
                    System.out.println("Found different instances");
                    System.out.println("Singleton 1: " + singleton1);
                    System.out.println("Singleton 2: " + singleton2);
                    isDifferentInstancesFound = true;
                } else {
                    System.out.println("Both instances are the same.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }

    static class SingletonCallable implements Callable<SingletonTest> {
        @Override
        public SingletonTest call() {
            return SingletonTest.getInstance();
        }
    }
}
