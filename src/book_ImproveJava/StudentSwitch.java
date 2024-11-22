package book_ImproveJava;

public class StudentSwitch {
    public static void main(String[] args) {
        int grade = 12;
        String gradeText = switch (grade) {
            case 0, 1, 2, 3, 4, 5 -> "Insufficient";
            case 6, 7 -> "Sufficient";
            case 8, 9 -> "Good";
            case 10 -> "Excellent";
            default -> "Invalid";
        };

        System.out.println(gradeText);
    }
}
