package JavaProfessionalCourse.Lesson11_Queue_Stack_ArrayDeque;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MyArrayDeque implements Deque<Integer> {
    private static int DEFAULT_SIZE = 10;
    Integer[] elements;
    int size;

    int head;
    int tail;

    public MyArrayDeque() {
    }


    @Override
    public void addFirst(Integer newElem) {
        /*
        есть 2 идеи реалзиации: как в аррай листе, добавляем и смещаем
        но эта операция может быть очень часто, и копирование будет затратная операция
        если используем декью вместо стека, то очень часто добавляется в начало.
        как лучше решить, что б мы работали в массиве, но эту операцию проводили очень незартрано

        можно изначально взять массив, поделить на 2 и добавлять в 2 стороны
        если нужно расширять массив, то есть проблемы в какую сторону расширивать массив или по середние

        другой подход:
        когда делали реализацию myarraylista circle iterator = массив представляет собой круг
        пока голова с хвостом не соединилась, нужно увеличивать массив

        */
        if (elements == null) {
            elements = new Integer[DEFAULT_SIZE];
        }

        if (dec(head) == tail ) {
            grow();
        }

        elements[head] = newElem;
        head = dec(head);

    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + oldCapacity/2;

        Integer[] newArray = Arrays.copyOf(elements, newCapacity);
        if (head > tail) {
            System.arraycopy(elements, head, newArray,
                    newCapacity-oldCapacity,
                    oldCapacity - head);
            for (int i = head; i < oldCapacity - head; i++) {
                newArray[i] = null;
            }
            head = oldCapacity;
        }
        elements = newArray;
    }

    @Override
    public void addLast(Integer newElem) {
        if (elements == null) {
            elements = new Integer[DEFAULT_SIZE];
        }
        elements[tail] = newElem;
        tail = inc(tail);

        if (head == inc(tail)) {
            grow();
        }
        tail = inc(tail);
        elements[tail] = newElem;
    }

    // дополнительыне методы
    private int inc(int index) {
        if (index == elements.length - 1) {
            return 0;
        }
        return index++;
    }

    private int dec(int index) {
        if (index == 0) {
            return elements.length - 1;
        }
        return index--;
    }

    @Override
    public Integer removeFirst() {
        Integer elem2Remove = elements[head];
        elements[head] = null;
        head = inc(head);
        return elem2Remove;
    }

    @Override
    public Integer removeLast() {
        Integer elem2Remove = elements[tail];
        elements[tail] = null;
        tail = dec(tail);
        return elem2Remove;
    }

    @Override
    public Integer pollFirst() {
        return removeFirst();
    }

    @Override
    public Integer pollLast() {
        return removeLast();
    }









    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }



    @Override
    public Integer getFirst() {
        return null;
    }

    @Override
    public Integer getLast() {
        return null;
    }

    @Override
    public Integer peekFirst() {
        return getFirst();
    }

    @Override
    public Integer peekLast() {
        return getLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

    @NotNull
    @Override
    public Iterator<Integer> descendingIterator() {
        return null;
    }
}
