package JavaProfessionalCourseHomeWork.HomeWork14.Level1.Exercise7;

public class Exercise7 {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.add("А", "Б");
        graph.add("А", "В");
        graph.add("А", "Г");
        graph.add("А", "Д");
        graph.add("Д", "И");
        graph.add("Д", "Г");
        graph.add("Б", "Е");
        graph.add("Б", "В");
        graph.add("В", "Ж");
        graph.add("Г", "В");
        graph.add("Г", "З");
        graph.add("Е", "К");
        graph.add("Ж", "К");
        graph.add("Ж", "З");
        graph.add("З", "К");
        graph.add("И", "К");

        graph.print();
    }
}
