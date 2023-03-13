package JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6;

public final class personalNumber {
    private int count;
    final private int yearOfBirth;
    private Sex sex;

    public personalNumber(int yearOfBirth, Sex sex) {
        count++;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    }
}
