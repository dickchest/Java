package JavaCourse.Lesson10_Massives;

public class One {
    public static void main(String[] args) {
        int[] ints = new int[10];
        int[] ints2; // declaring array
        //....
        ints2 = new int[32]; // allocationg memory to array

        // int по умолчаниею 0
        // boolean -> false
        // null для ссылочных типов
        int[] ints3 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(ints3[i]);
        }
        // Integer = целочисленный тип. получаем null

        // создание массива представляет 2 этапа:
        // обьявить переменную нужного типа массива;
        // выделить память для хранения массива, используя new
        // таким образом в яве организуются массивы динамически

        // возможно сразу внести элементы массива
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 19};

        String[] strings = {"a", "b", "c", "dsd"};

        String strings2[] = {"a", "b", "c", "dsd"}; // устаревшее описание как в си

        Person[] persons = new Person[2];
        persons[0] = new Person();
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }

    static class Person { }
}
