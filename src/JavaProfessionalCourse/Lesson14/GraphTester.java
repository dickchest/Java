package JavaProfessionalCourse.Lesson14;

public class GraphTester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.add(1, 2, 3);
        graph.add(3, 1, 2);
        graph.add(1, 5, 8);
        graph.add(2, 3, 6);
        graph.add(3, 4, 1);
        graph.add(6, 7, 8);
        graph.add(7, 1, 1);
        graph.add(8, 8, 5);
        graph.add(7, 9, 4);

        // распечатать
        // print graph

//        graph.pring();
        graph.printBfs();
//        graph.printDfs();

    }
}
