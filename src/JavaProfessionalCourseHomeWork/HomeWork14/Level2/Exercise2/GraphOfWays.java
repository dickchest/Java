package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise2;

import java.util.*;

public class GraphOfWays {
    private Map<String, List<Edge>> nodes = new TreeMap<>();


    // метод добавления графа
    public void add(String from, String to) {
        List<Edge> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(new Edge(from, to));
    }

    // метод распечатывания графа
    public void print() {
        for (Map.Entry<String, List<Edge>> entry : nodes.entrySet()) {
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

    // метод поиска всех путей на основе bfs
    // чуть изменил код и использовал стек
    public void printWayDfs(String lastNode) {
        String firstElem = nodes.keySet().iterator().next();
        Stack<String> stackOfNodes = new Stack<>();
        stackOfNodes.push(firstElem);

        // переменная для хранения количества путей
        int countOfWays = 0;

        while (!stackOfNodes.isEmpty()) {
            // берем текущую ноду из стека
            String currentNodeIndex = stackOfNodes.pop();
            System.out.print(currentNodeIndex + "-");
            // берем весь лист ребер
            List<Edge> edges = nodes.get(currentNodeIndex);

            // если вершина не содержит ребер, то 
            if (edges == null) {
                continue;
            }

            // добавляем в стек все близлежащие вершины
            for (Edge edge : edges) {
                if (edge.to.equals(lastNode)) {
                    // если дошли до искомой точки, добавляем еще один путь
                    countOfWays++;
                    System.out.print(lastNode + '\n');
                    continue;
                }
                stackOfNodes.push(edge.to);
            }
        }
        System.out.println("Количество путей: " + countOfWays);
    }

}
