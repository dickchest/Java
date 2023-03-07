package JavaProfessionalCourseHomeWork.HomeWork14.Level2.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        GraphOfWays graph = new GraphOfWays();
        graph.add("А", "Б");
        graph.add("А", "В");
        graph.add("Б", "Г");
        graph.add("Б", "Е");
        graph.add("В", "Д");
        graph.add("В", "Г");
        graph.add("Г", "Д");
        graph.add("Г", "Ж");
        graph.add("Д", "Ж");
        graph.add("Е", "Г");
        graph.add("Е", "Ж");

        graph.printWayDfs("Ж");


    }
}
