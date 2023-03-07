package JavaProfessionalCourse.Lesson14;

import java.util.*;

public class Graph {
    //    List<Node> nodes;
//    int[][] array;
//    Map<Integer, List<Integer>> nodes = new TreeMap<>();
//    Map<Integer, List<Edge>> nodes = new TreeMap<>();
    Map<Integer, List<Edge>> nodes = new TreeMap<>();

    public void print() {

        for (Map.Entry<Integer, List<Edge>> entry : nodes.entrySet()) {

            for (Edge connectedNode : entry.getValue()) {
                System.out.printf("%s ->(%s) %s%n", connectedNode.from, connectedNode.weight, connectedNode.to);
            }
        }


    }


    // вершины
    // ребра

    /*
    вершина графа
     */
    public class Node {
        private int value;
        private List<Edge> edges;

        public Node() {
        }
    }

    // ребро графа
    public class Edge {
        private int from;
        private int to;
        private int weight;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    // метод для добавления новой ноды
    public void add(int from, int to, int weight) {
        List<Edge> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(new Edge(from, to, weight));

//        if (to != from) {
//            List<Edge> connectedNodes2 = nodes.get(to);
//            if (connectedNodes2 == null) {
//                connectedNodes2 = new ArrayList<>();
//                nodes.put(to, connectedNodes2);
//            }
//            connectedNodes2.add(new Edge(to, Edge));
//        }
    }

    public void printBfs() {
        Integer firstElem = nodes.keySet().iterator().next();  // берем первую ноду
        Queue<Integer> elements = new ArrayDeque<>();   // очередь для хранения элементов и забирания первого
        elements.add(firstElem); // добавляем типа в стек первый эелемент
        List<Integer> alreadyProcessed = new ArrayList<>();  // для запоминания элементов, по которым прошлись
        while (!elements.isEmpty()) {    // пока есть в стеке элементы для обработки
            Integer currentNodeIndex = elements.poll();     // достаем первый элемент
            if (!alreadyProcessed.contains(currentNodeIndex)) {   // если вершину еще не обрабатывали
                System.out.println(currentNodeIndex);       // выводим эту вершину
                alreadyProcessed.add(currentNodeIndex);     // добавляем ее к уже отработавшим
                List<Edge> edges = nodes.get(currentNodeIndex);     // запоминаем все исходящие из нее ребра
                if (edges == null) {    // если вершина конечная или нет дальнейших ребер, то продолжаем сначала
                    continue;
                }
                for (Edge edge : edges) {       // заполняем стек следующими ближайшими вершинами
                    elements.add(edge.to);
                }
            }
        }
    }



    public void printDfs() {
        Integer firstElem = nodes.keySet().iterator().next();
        Stack<Integer> elements = new Stack<>();
        elements.push(firstElem);
        List<Integer> alreadyProcessed = new ArrayList<>();
        while (!elements.isEmpty()) {
            Integer currentNodeIndex = elements.pop();
            if (!alreadyProcessed.contains(currentNodeIndex)) {
                System.out.println(currentNodeIndex);
                alreadyProcessed.add(currentNodeIndex);
                List<Edge> edges = nodes.get(currentNodeIndex);
                if (edges == null) {
                    continue;
                }
                for (Edge edge : edges) {
                    elements.add(edge.to);
                }
            }
        }
    }

    public void findCycles() {
        List<Integer> nodesIndexes = new ArrayList<>(nodes.keySet());
        Collections.sort(nodesIndexes);
        //Integer max = Collections.max(nodesIndexes);
        int[] colors = new int[10];
        // 0 - белый
        // 1 - серый
        // 2 - черный
        for (Integer key : nodes.keySet()) {
            if (colors[key] == 0) {
                findCycle(key, colors);
            }
        }
    }

    public boolean findCycle(int nodeIndex, int[] colors) {
        colors[nodeIndex] = 1;
        boolean isCycle = false;
        List<Edge> edges = nodes.get(nodeIndex);
        if (edges != null) {
            for (Edge edge : edges) {
                if (colors[edge.to] == 0) {
                    isCycle = isCycle || findCycle(edge.to, colors);
                } else if (colors[edge.to] == 1) {
                    isCycle = true;
                    System.out.println("цикл найден!");
                }
            }
        }
        colors[nodeIndex] = 2;
        if (isCycle) {
            System.out.println(nodeIndex);
        }
        return isCycle;
    }

}
