package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise7;

import java.util.ArrayList;
import java.util.List;

public class TreeGeneric<T>{
    private Node<T> root;

    public static class Node<T> {
        T data;
        List<Node<T>> children;

        public Node(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public TreeGeneric() {
        this.root = null;
    }

    public void addRoot(T data) {
        if (root == null) {
            root = new Node<>(data);
        }
    }

    public void addChild(Node<T> parent, T data) {
        Node<T> child = new Node<>(data);
        parent.children.add(child);
    }

    public void addChild(T data) {
        Node<T> child = new Node<>(data);
        root.children.add(child);
    }

    public void print() {
        print(root, 0);
    }

    private void print(Node<T> node, int level) {
        if (node == null) {
            return;
        }
        String str = new String();
        for (int i = 0; i < level; i++) {
            str = str + "    ";
        }
        str = str + node.data.toString();
        System.out.println(str);

        for (Node<T> child : node.children) {
            print(child, level + 1);
        }

    }

}
