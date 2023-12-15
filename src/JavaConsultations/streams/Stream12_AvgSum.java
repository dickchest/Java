package JavaConsultations.streams;

import java.util.LongSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream12_AvgSum {
    public static void main(String[] args) {
        /*
        OptionalDouble average()
        Только для примитивных стримов. Возвращает среднее арифметическое всех элементов. Либо Optional.empty, если стрим пуст.
         */
        double result = IntStream.range(0, 16)
                .average()
                .getAsDouble();
        System.out.println(result);

        /*
        sum()
        Возвращает сумму элементов примитивного стрима. Для IntStream результат будет типа int, для LongStream — long, для DoubleStream — double.
         */
        long result1 = LongStream.range(2, 16)
                .sum();
        System.out.println(result1);

        /*
        IntSummaryStatistics summaryStatistics()
        Полезный метод примитивных стримов. Позволяет собрать статистику о числовой последовательности стрима, а именно:
        количество элементов, их сумму, среднее арифметическое, минимальный и максимальный элемент.
         */
        LongSummaryStatistics stats = LongStream.range(2,16)
                .summaryStatistics();
        System.out.printf("count: %d%n", stats.getCount());
        System.out.printf("sum: %d%n", stats.getSum());
        System.out.printf("average: %.1f%n", stats.getAverage());
        System.out.printf("min: %d%n", stats.getMin());
        System.out.printf("max: %d%n", stats.getMax());
    }
}
