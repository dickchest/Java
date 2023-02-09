package JavaProfessionalCourse.Lesson8LinkedList.RepeatHomeWork7.List;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<Integer> {
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

    private Node findNodeByIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node currentNode = first;
        while (index != currentIndex) {
            currentIndex++;
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }


    @Override
    public Integer set(int index, Integer element) {
        Node nodeByIndex = findNodeByIndex(index);
        Integer prevValue = nodeByIndex.getValue();
        return null;
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

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator(first);
    }



    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }


    @Override
    public boolean remove(Object o) {
        Iterator<Integer> iterator = iterator();
        int index = 0;
        while(iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                // remove
                remove(index);
                return true;
            }
            index++;

        }
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return false;
    }






    @Override
    public boolean contains(Object o) {
        return false;
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


    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends Integer> c) {
        return false;
    }


    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return false;
    }







    @NotNull
    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @NotNull
    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}
