package JavaProfessionalCourseHomeWork.HomeWork8.List;

import java.util.ListIterator;

public class MyListIteratorList implements ListIterator<Integer> {
    private Node currentNode;
    private int index;

    public MyListIteratorList(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        if (currentNode.getPrev() == null) return currentNode != null;
        return currentNode.getNext() != null;
    }

    @Override
    public Integer next() {
        Node tmp = currentNode;
        currentNode = currentNode.getNext();
        if (tmp.getPrev() == null) {
            return tmp.getValue();
        }
        return currentNode.getValue();
    }

    @Override
    public boolean hasPrevious() {
        if (currentNode.getNext() == null) return currentNode != null;
        return currentNode.getNext() != null;
    }

    @Override
    public Integer previous() {
        Node tmp = currentNode;
        currentNode = currentNode.getPrev();
        if (tmp.getNext() == null) {
            return tmp.getValue();
        }
        return currentNode.getValue();
    }
// пока следующие методы не написал
    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {
    }

    @Override
    public void set(Integer integer) {

    }

    @Override
    public void add(Integer integer) {

    }
}
