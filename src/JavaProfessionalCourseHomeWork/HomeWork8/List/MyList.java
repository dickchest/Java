package JavaProfessionalCourseHomeWork.HomeWork8.List;

import java.util.*;

/**
 * @author Rustam Khakov
 */
public class MyList implements List<Integer>, Deque<Integer> {
    private int size;
    private Node first;
    private Node last;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Integer currentVal) {
        Node currentNode = new Node(currentVal);
        if (this.first == null) {
            this.first = currentNode;
            this.last = currentNode;
        } else {
            currentNode.setPrev(this.last);
            this.last.setNext(currentNode);
            this.last = currentNode;
        }
        this.size++;
        return true;
    }

    @Override
    public Integer get(int index) {
        return findNodeByIndex(index).getValue();
    }

    @Override
    public Integer set(int index, Integer newValue) {
        Node nodeByIndex = findNodeByIndex(index);
        Integer prevValue = nodeByIndex.getValue();
        nodeByIndex.setValue(newValue);
        return prevValue;
    }

    @Override
    public void add(int index, Integer newValue) {
        Node newNode = new Node(newValue);
        Node prevNodeAtIndex = findNodeByIndex(index);
        newNode.setPrev(prevNodeAtIndex.getPrev());
        newNode.setNext(prevNodeAtIndex);
        prevNodeAtIndex.setPrev(newNode);
        if (newNode.getPrev() != null) {
            newNode.getPrev().setNext(newNode);
        } else {
            this.first = newNode;
        }
        size++;
    }


    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }


    @Override
    public Integer remove(int index) {
        Node node2Remove = findNodeByIndex(index);
        Integer removedValue = node2Remove.getValue();
        Node prevNode = node2Remove.getPrev();
        Node nextNode = node2Remove.getNext();
        if (prevNode != null) {
            prevNode.setNext(nextNode);
        } else {
            this.first = nextNode;
        }

        if (nextNode != null) {
            nextNode.setPrev(prevNode);
        } else {
            this.last = prevNode;
        }
        node2Remove.setPrev(null);
        node2Remove.setNext(null);
        size--;
        return removedValue;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator(first);
    }

    @Override
    public boolean remove(Object o) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                remove(index);
                return true;
            }
            index++;
        }
        return false;
    }


    @Override
    public boolean contains(Object o) {
        Iterator<Integer> iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                remove(index);
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer i : c) {
            add(i);
        }
        return true;
    }

    private Node findNodeByIndex(int index) {
        // если index > size/2 -> с конца до индекса уменьшая теукщий индекс
        // иначе с начала до индекса
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node currentNode = first;
        int operand = 1;

        if (index > size() / 2) {
            currentIndex = size() - 1;
            currentNode = last;
            operand = -1;
        }

        while (index != currentIndex) {
            currentIndex += operand;

            if (operand > 0) {
                currentNode = currentNode.getNext();
            } else {
                currentNode = currentNode.getPrev();
            }
        }
        return currentNode;
    }

    /**
     * Уровень 2 - методы
     * <p>
     * x* @see this#findNodeByIndex(int) - сделать поиск с конца, если индекс находится во второй половине списка
     *
     * @see this#descendingIterator() - итератор из конца в начало
     * @see this#listIterator() - итератор с дополнительной сылкой на предыдущий
     * @see this#toArray() - перевести в массив
     * @see this#containsAll(Collection) - проверить содержатся ли все
     * @see this#removeAll(Collection) - удалить все которые содержатся в коллекции
     * @see this#lastIndexOf(Object)  - последний индекс входного элемента (идеально пожходит итератор с конца в начало)
     * Уровень 3
     * @see this#subList(int, int) - вернуть новый майлист который будет обрезан
     * @see this#addAll(int, Collection) - добавить все начиная с какого-то индекса
     * @see this#retainAll(Collection) - удалить все что не содержится во входной коллекции
     */

    @Override
    public Iterator<Integer> descendingIterator() {
        return new MyDescendingIterator(last);
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return new MyListIteratorList(first);
    }


    @Override
    public Object[] toArray() {
        Iterator<Integer> iterator = iterator();
        Integer[] array = new Integer[size()];
        int index = 0;
        while (iterator.hasNext()) {
            array[index] = iterator.next();
            index++;
        }
        return array;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<Integer> objectIterator = (Iterator<Integer>) c.iterator();
        boolean searchResult = false;
        while (objectIterator.hasNext()) {
            Integer nextObject = objectIterator.next();

            Iterator<Integer> listIterator = iterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().equals(nextObject)) {
                    searchResult = true;
                    break;
                }
            }
            if (!searchResult) {
                return false;
            }
            searchResult = false;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // лист для копирования
        Integer[] tempArray = (Integer[]) toArray();

        clear();

        boolean searchResult = false;
        boolean isInTheList = false;

        for (Integer i : tempArray) {

            for (Object objectIterator : c) {
                if (i.equals(objectIterator)) {
                    searchResult = true;
                    isInTheList = true;
                    break;
                }
            }
            if (!isInTheList) {
                add(i);
            }
            isInTheList = false;
        }
        return searchResult;
    }

    @Override
    public int lastIndexOf(Object o) {
        Integer[] array = (Integer[]) toArray();
        for (int i=array.length-1; i >= 0 ; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        if (fromIndex<0 || fromIndex>size || toIndex<0 || toIndex > size || toIndex<fromIndex) {
            throw new IndexOutOfBoundsException();
        }
        List<Integer> subList = new MyList();
        int index = 0;
        Iterator<Integer> iterator = iterator();
        while (iterator.hasNext()) {
            Integer tempValue = iterator.next();
            if (index >= fromIndex && index <= toIndex) {
                subList.add(tempValue);
            }
            index++;
        }
        return subList;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {

        if (index<0 || index > size || c.equals(null)) {
            return false;
        }
        int addElementsIndex = 0;

        for (Integer element : c) {
            add(index+addElementsIndex, element);
            addElementsIndex++;
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // лист для копирования
        Integer[] tempArray = (Integer[]) toArray();
        clear();

        boolean searchResult = false;
        boolean isInTheList = false;

        for (Integer i : tempArray) {
            for (Object objectIterator : c) {
                if (i.equals(objectIterator)) {
                    searchResult = true;
                    isInTheList = true;
                    break;
                }
            }
            if (isInTheList) {
                add(i);
            }
            isInTheList = false;
        }
        return searchResult;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public void push(Integer integer) {
        add(0, integer);
    }

    @Override
    public Integer pop() {
        return remove(size - 1);
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public void addFirst(Integer integer) {
        add(0, integer);
    }

    @Override
    public void addLast(Integer integer) {
        add(integer);
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
    public Integer removeFirst() {
        return remove(0);
    }

    @Override
    public Integer removeLast() {
        return remove(size - 1);
    }

    @Override
    public Integer pollFirst() {
        return remove(0);
    }

    @Override
    public Integer pollLast() {
        return remove(size - 1);
    }

    @Override
    public Integer getFirst() {
        return get(0);
    }

    @Override
    public Integer getLast() {
        return get(size - 1);
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

}
