package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise1;

public class GraphMatrix {
    private Integer[][] graph;

    public GraphMatrix() {
        graph  = new Integer[10][10];
    }

    public void add(Integer from, Integer to, Integer weight) {
        graph[from][to] = weight;
    }

    public void print() {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == null) continue;
                System.out.print(i + " (" + graph[i][j] + ") -> " + j+"; ");
                System.out.println();
            }
        }
    }
}
