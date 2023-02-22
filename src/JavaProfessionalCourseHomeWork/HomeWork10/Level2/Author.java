package JavaProfessionalCourseHomeWork.HomeWork10.Level2;

import org.jetbrains.annotations.NotNull;

public class Author implements Comparable<Author> {
    private String firstName;
    private String surName;
    private int yearOfBirthday;

    public Author(String firstName, String surName, int yearOfBirthday) {
        this.firstName = firstName;
        this.surName = surName;
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    @Override
    public int compareTo(@NotNull Author o) {
        int compResult = Integer.compare(this.yearOfBirthday, o.yearOfBirthday);
        if (compResult == 0) {
            return this.surName.compareTo(o.surName);
        }
        return compResult;
    }

    @Override
    public String toString() {
        return firstName +
                ' ' + surName +
                " (" + yearOfBirthday +
                ')';
    }
}
