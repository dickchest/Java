package JavaConsultations.Stack;

//import java.util.Stack;

public class Main {
    /*
    Теория -
    Структура данных - способ расположения элементов в памяти, подразумевающий определенный алгоритм работы со структурой
    Стек - структура данных работающая по принципу LIFO - last in first out. Т.е. элементы в структуру добавляються наверх стека и извлекаются с вершины стека
    Коллекции - набор классов, реализующие основные структуры данных и алгоритмы к ним.
    Для работы со стеками в джава существует класс Stack

    Ответ по поводу Джнереиков - обекту класса родителей мы можем присвоить обекты класса потомков
    Object - класс родитель для всех классов джава
    null - пустая ссылка
     */
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(1);
        stack.push("Hello");


        stack.stackOut();
        stack.arrayOut();

        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);

        stack.stackOut();
        stack.insertIntoPosition(12345, 1);

        stack.stackOut();
        stack.arrayOut();



    }
}
