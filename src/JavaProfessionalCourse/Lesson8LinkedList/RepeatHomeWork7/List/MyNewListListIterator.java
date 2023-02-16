package JavaProfessionalCourse.Lesson8LinkedList.RepeatHomeWork7.List;

import java.util.ListIterator;

public class MyNewListListIterator implements ListIterator<Integer> {

    private Node currentNode;
    private Node prevNode;
    int index;


    public MyNewListListIterator(Node currentNode) {
        this.currentNode = currentNode;
        prevNode = null;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Integer next() {
        Integer value = currentNode.getValue();
        prevNode = currentNode;
        currentNode = currentNode.getNext();
        index++;
        return value;
    }

    @Override
    public boolean hasPrevious() {
        return prevNode != null;
    }

    @Override
    public Integer previous() {
        Integer value = currentNode.getValue();
        prevNode = prevNode.getPrev();
        currentNode = currentNode.getPrev();
        index--;
        return value;
    }

    @Override
    public int nextIndex() {
        return index + 1;
    }

    @Override
    public int previousIndex() {
        return index - 1;
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
