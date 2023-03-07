package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise3;

import java.util.*;

public class GraphMatrix {
    private int[][] graph;

    public GraphMatrix() {
        graph  = new int[10][10];
    }

    public void add(Integer from, Integer to, Integer weight) {
        graph[from][to] = weight;
    }

    public void print() {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 0) continue;
                System.out.print(i + " (" + graph[i][j] + ") -> " + j+"; ");
                System.out.println();
            }
        }
    }

    public void printDfs(int firstNode) {
        HashSet<Integer> visited = new HashSet<>();
        dfsCycle(firstNode, visited);
        System.out.println();
    }

    private void dfsCycle(int currentNode, HashSet<Integer> visited) {
        visited.add(currentNode);
        System.out.print(currentNode + " ");
        for (int neighbor = 1; neighbor < graph[currentNode].length; neighbor++) {
            if(graph[currentNode][neighbor] == 0) continue;
            if (!visited.contains(neighbor)) {
                dfsCycle(neighbor,visited);
            }
        }
    }

    public void printBfs(int firstNode) {
        Queue<Integer> elements = new LinkedList<>();
        elements.add(firstNode);
        boolean[] alreadyProceed = new boolean[graph.length];
        alreadyProceed[firstNode] = true;

        while(!elements.isEmpty()) {
            Integer currentNodeIndex = elements.poll();
            System.out.print(currentNodeIndex + " ");

            for (int i = 0; i < graph.length; i++) {
                if (graph[currentNodeIndex][i] != 0 && !alreadyProceed[i]) {
                    alreadyProceed[i] = true;
                    elements.add(i);
                }
            }
        }

    }
}
