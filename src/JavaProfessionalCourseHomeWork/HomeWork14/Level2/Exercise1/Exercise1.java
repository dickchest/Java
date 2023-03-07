package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise1;

import JavaProfessionalCourseHomeWork.HomeWork14.Level1.Exercise7.Graph;

public class Exercise1 {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix();
        graph.add(1, 2, 1);
        graph.add(1, 3, 4);
        graph.add(2, 1, 2);
        graph.add(8,1,3);
        graph.add(4,3,2);

        graph.print();

    }
}
