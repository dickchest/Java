package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix();
        graph.add(1, 2, 1);
        graph.add(1, 5, 1);
        graph.add(1, 3, 1);
        graph.add(2, 4, 1);
        graph.add(5, 4, 1);
        graph.add(3, 2, 1);
//        graph.add(8,1,1);
        graph.add(4,3,1);

        graph.print();
        System.out.println("----");
        graph.printDfs(1);
        System.out.println("----");
        graph.printBfs(1);
    }
}
