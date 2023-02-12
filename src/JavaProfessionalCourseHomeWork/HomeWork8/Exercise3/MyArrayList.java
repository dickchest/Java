package JavaProfessionalCourseHomeWork.HomeWork8.Exercise3;

import java.util.*;

/**
 * @author Rustam Khakov
 * @see this#toArray() уже реализован
 * Уровень 1
 * @see this#size()
 * @see this#isEmpty()
 * @see this#iterator()
 * @see this#clear()
 * @see this#get(int)
 * @see this#set(int, Integer)
 * @see this#contains(Object)
 * @see this#indexOf(Object)
 * @see this#lastIndexOf(Object)
 * @see this#add(Integer)
 * Уровень 2
 * @see this#remove(Object)
 * @see this#remove(int)
 * @see this#add(int, Integer)
 */
public class MyArrayList implements List<Integer> {
    Integer[] array;

    public MyArrayList() {
        //todo реализуй меня
        array = new Integer[0];
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) return false;
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator(array);
    }

    @Override
    public void clear() {
        new MyArrayList();
    }

    @Override
    public Integer get(int index) {
        return array[index];
    }

    @Override
    public Integer set(int index, Integer value) {
        if (array.length > 0 && index < array.length) {
            int temp = array[index];
            array[index] = value;
            return temp;
        }
        System.out.println(("нет элемента с таким номером"));
        return null;
    }

    @Override
    public boolean add(Integer value) {
        Integer[] tempArray = array;
        this.array = Arrays.copyOf(tempArray, tempArray.length + 1);
        array[array.length - 1] = value;
        return true;//создать новый массив потом сделать copy старых значений в новый массив
    }

    @Override
    public boolean contains(Object o) {
        for (Integer i : array) {
            if (i.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer remove(int index) {
        // создать копию массива на размер 1 меньше
        // нужно будет создать новый массив, после скопировать в него все что до этого индекса
        // скопировать все что после этого индекса
        Integer[] tempArray = array;
        Integer deletedValue = array[index];
        array = new Integer[tempArray.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array[i] = tempArray[i];
            } else {
                array[i] = tempArray[i+1];
            }
        }
        return deletedValue;
    }

    @Override
    public void add(int index, Integer value) {
        // нужно будет создать новый массив, после скопировать в него все что до этого индекса
        // вставить этот индекс и скопировать все что после этого индекса
        Integer[] tempArray = array;
        array = new Integer[tempArray.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array[i] = tempArray[i];
            } else if (i == index) {
                array[i] = value;
            } else {
                array[i] = tempArray[i - 1];
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }


    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * !!!!!!!    все что ниже не реализовываем  !!!!!!!
     */


    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        List<Integer> newList = new ArrayList<>();
        for (int i = fromIndex; i <= toIndex ; i++) {
            newList.add(array[i]);
        }
        return newList;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null; //не реализовывать
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

