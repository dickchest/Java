package JavaConsultations.Stack;
/*
Базовые операции стека
push - добавление элемента на вершину
pop - верунть верхний элемент и удалить
peek - показывает верхний первый элемент
 */

public class Stack {
    private Object[] arr;
    private int count;

    public Stack(int size) {  // выделяем начальную память для стека
        arr = new Object[size];  // создаем массив для элементов
        count = -1;
    }

    /**
     * метода для добавления элементов в вершину стека
     * @param value добавляемое значение
     */
    public void push(Object value) {
        if (0.8 * arr.length <= count) {            // проверяем, достаточно ли памяти. Если нет - добавляем память
            addMemory();
        }
        count ++;
        arr[count] = value;
    }

    /**
     * метод для выделения дополнительной памяти
     */
    private void addMemory() {
        Object[] temp = arr;        // запоминаем старые элементы
        arr = new Object[2*arr.length]; // создаем более крупный массив
        copyArray(temp);            // копируем старый массив в новый
    }

    /**
     * метод для записи значений старого массива в новый
     * @param temp
     */
    private void copyArray(Object[] temp) {
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    /**
     * возвращает последний элемент
     * @return последний элемент или -1 если стек пустой
     */
    public Object pop() {
        if (count == -1) {
            System.out.println("Стек пустой");
            return -1;
        }
        return arr[count--];
    }

    /**
     * метод возвращает вершину стека
     * @return последний элемент или -1 если стек пустой
     */
    public Object peek() {
        if (count == -1) {
            System.out.println("Стек пустой");
            return -1;
        }
        return arr[count];
    }

    /**
     * метод выводит на экран весь стек
     */
    public void stackOut(){
        System.out.println("Stack: ");
        for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * метод выводит на экран весь массив
     */
    public void arrayOut(){
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для добавления в произвольную область стека
     * @param value что добавлять
     * @param position куда добавить
     */
    public void insertIntoPosition(Object value, int position) { // реализация более продвинутой версии стека
        for (int i = count; i > position; i--) {    // делаем сдвиг элементов для добавления позиции
            arr[i] = arr[i-1];
        }
        arr[position] = value;              // прислваимваем элемент освобожденной позиции
        count++;                    // увеличиваем счетчик добавленных элементов
    }
}
