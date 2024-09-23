package book_designPatterns._5_Singelton._4_Stat;

import java.util.concurrent.*;

public class mainThreadsWithCallable {
    public static void main(String[] args) {


        // Создаем пул потоков с двумя потоками
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Создаем два Callable задания для получения синглетон
        Callable<SingletonTest> task1 = new SingletonCallable();
        Callable<SingletonTest> task2 = new SingletonCallable();

        SingletonTest singleton1 = null;
        SingletonTest singleton2 = null;

        // Отправляем задачи на выполнение и получае Future для результата
        Future<SingletonTest> future1 = executor.submit(task1);
        Future<SingletonTest> future2 = executor.submit(task2);

        while (singleton1 == singleton2) {
            try {

                // Получаем результат из каждого потока
                singleton1 = future1.get();
                singleton2 = future2.get();

                // Проверяем, что оба потока вернули один и тот же экземпляр Singleton
                System.out.println("Singleton 1: " + singleton1);
                System.out.println("Singleton 2: " + singleton2);
                System.out.println("Both instances are the same: " + (singleton1 == singleton2));

            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                // завершаем работу пула потоков
                executor.shutdown();
            }
        }
    }

    static class SingletonCallable implements Callable<SingletonTest> {

        @Override
        public SingletonTest call() throws Exception {
            return SingletonTest.getInstance();
        }
    }
}
