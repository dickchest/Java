package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise9;

public class DatabaseTest {
    public static void main(String[] args) {
        Database<Integer, String> database = new Database<>();
        database.add(1, "DataOne");
        database.add(2, "DataTwo");
        database.add(3, "DataThree");

        System.out.println(database.get(3));

//        Database<String, String> database2 = new Database<>();
//        выдает ошибку, т.к. кей является не наследником Нуммер
    }
}
