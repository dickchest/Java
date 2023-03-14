package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*
8. Переделайте Graph чтобы он был generic class
 */
public class Graph<T> {
    private Map<T, List<Edge>> nodes = new TreeMap<>();


    // метод добавления графа
    public void add (T from, T to) {
        List<Edge> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(new Edge(from, to));
    }

    // метод распечатывания графа
    public void print() {
        for ( Map.Entry<T, List<Edge>> entry : nodes.entrySet()) {
            for (Edge connectedNode : entry.getValue()) {
                System.out.printf("%s -> %s%n", connectedNode.from, connectedNode.to);
            }
            System.out.println("---");
        }
    }


    // ==================
    // создаем встроенный класс ребре
    // реализуем конструктор и геттеры
    public class Edge<T> {
        private T from;
        private T to;

        public Edge(T from, T to) {
            this.from = from;
            this.to = to;
        }
    }


}
