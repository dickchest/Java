package Algorithms.lesson5_MergeSort.homework;

/*
Дан массив объектов типа Person, который содержит поля name (тип String) и age (тип int). Необходимо
отсортировать этот массив по возрасту в порядке убывания, используя алгоритм Merge sort.

 */
public class Level2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        mergeSort(people);
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void mergeSort(Person[] people) {
        int peopleLength = people.length;
        // базовое условие
        if (peopleLength == 1) {
            return;
        }
        // иначе разделяем массивы
        int mid = peopleLength / 2;
        Person[] left = new Person[mid];
        Person[] right = new Person[peopleLength - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = people[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = people[i + mid];
        }
        // вызываем рекурсивно
        mergeSort(left);
        mergeSort(right);

        // достигнуто базовое услови
        // проивзодится слияние массива
        merge(people, left, right);


    }

    private static void merge(Person[] people, Person[] left, Person[] right) {
        int leftCount = 0;
        int rightCount = 0;
        int peopleCount = 0;

        while (leftCount < left.length && rightCount < right.length) {
            if (left[leftCount].getAge() < right[rightCount].getAge()) {
                people[peopleCount] = left[leftCount];
                leftCount++;
            } else {
                people[peopleCount] = right[leftCount];
                rightCount++;
            }
            peopleCount++;
        }

        while (leftCount < left.length) {
            people[peopleCount] = left[leftCount];
            leftCount++;
            peopleCount++;
        }

        while (rightCount < right.length) {
            people[peopleCount] = right[rightCount];
            rightCount++;
            peopleCount++;
        }
    }
}
