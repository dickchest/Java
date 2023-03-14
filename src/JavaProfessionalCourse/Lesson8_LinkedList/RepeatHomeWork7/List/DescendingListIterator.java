package JavaProfessionalCourse.Lesson8_LinkedList.RepeatHomeWork7.List;

import java.util.Iterator;

public class DescendingListIterator implements Iterator<Integer> {
    private Node currentNode;

    public DescendingListIterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Integer next() {
        Integer value = currentNode.getValue();
        currentNode = currentNode.getPrev();
        return value;
    }
}
