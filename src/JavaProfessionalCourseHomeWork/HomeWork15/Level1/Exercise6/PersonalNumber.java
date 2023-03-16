package JavaProfessionalCourseHomeWork.HomeWork15.Level1.Exercise6;

public record PersonalNumber(int count, int yearOfBirth, Sex sex) {
    public PersonalNumber(Person person) {
        this(person.getCounter(), person.getYearOfBirth(), person.getSex());
    }
}


// старый полный класс
//public final class PersonalNumber {
//    private int count;
//    final private int yearOfBirth;
//    final private Sex sex;
//
//    public PersonalNumber(int yearOfBirth, Sex sex) {
//        count++;
//        this.yearOfBirth = yearOfBirth;
//        this.sex = sex;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonalNumber that = (PersonalNumber) o;
//        return count == that.count && yearOfBirth == that.yearOfBirth && sex == that.sex;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(count, yearOfBirth, sex);
//    }
//}
