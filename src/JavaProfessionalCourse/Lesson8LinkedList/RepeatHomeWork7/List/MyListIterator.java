package JavaProfessionalCourse.Lesson8LinkedList.RepeatHomeWork7.List;

import java.util.Iterator;

public class MyListIterator implements Iterator<Integer> {
    private Node currentNode;

    public MyListIterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Integer next() {
        Integer value = currentNode.getValue();
        currentNode = currentNode.getNext();
        return value;
    }
}
