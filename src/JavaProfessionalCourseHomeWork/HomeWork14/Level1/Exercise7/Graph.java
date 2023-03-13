package JavaProfessionalCourseHomeWork.HomeWork14.Level1.Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Graph {
    private Map<String, List<Edge>> nodes = new TreeMap<>();


    // метод добавления графа
    public void add (String from, String to) {
        List<Edge> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(new Edge(from, to));
    }

    // метод распечатывания графа
    public void print() {
        for ( Map.Entry<String, List<Edge>> entry : nodes.entrySet()) {
            for (Edge connectedNode : entry.getValue()) {
                System.out.printf("%s -> %s%n", connectedNode.from, connectedNode.to);
            }
            System.out.println("---");
        }
    }


    // ==================
    // создаем встроенный класс ребре
    // реализуем конструктор и геттеры
    public class Edge {
        private String from;
        private String to;

        public Edge(String from, String to) {
            this.from = from;
            this.to = to;
        }
    }


}
