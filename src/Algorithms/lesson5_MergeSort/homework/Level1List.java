package Algorithms.lesson5_MergeSort.homework;

import java.util.*;

/*
У вас есть список из n элементов, которые представляют собой оценки студентов по математике. Вам нужно
отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает
новый список, отсортированный в порядке убывания.

 */
public class Level1List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(3, 8, 1, 9, 4, 2, 7, 6, 5));
        System.out.println(mergeSortList(list));


    }

    private static List<Integer> mergeSortList(List<Integer> list) {
        // базовый случа
        if (list.size() == 1) return list;
        // разбиваем на 2
        int mid = list.size()/2;
        List<Integer> left = list.subList(0, mid);
        List<Integer> right = list.subList(mid, list.size());
        // рекурсивно вызываем для двух листов
        mergeSortList(left);
        mergeSortList(right);
        // достигнуто базовый случай
        // слияние
        return merge(left, right);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> leftQueue = new ArrayDeque<>(left);
        Queue<Integer> rightQueue = new ArrayDeque<>(right);

        while (!leftQueue.isEmpty() || !rightQueue.isEmpty()) {
            if (leftQueue.isEmpty()) {
                list.add(rightQueue.poll());
            } else if (rightQueue.isEmpty()) {
                list.add(leftQueue.poll());
            } else if (leftQueue.peek() < rightQueue.peek()) {
                list.add(leftQueue.poll());
            } else {
                list.add(rightQueue.poll());
            }
        }

        System.out.println(list);
            return list;
    }
}
