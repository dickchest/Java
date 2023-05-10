package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_1_intern;

public class Task_6 {
    public static void main(String[] args) {
        try {
            Object x[] = new String[3];
            x[0] = Integer.valueOf(0);
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStroeException");
        }
    }
}
