package JavaProfessionalCourse.Lesson15_ImmutableClasses;

public class ChangableClass extends NonChangableClass{
    public ChangableClass(int age, String name) {
        super(age, name);
        System.out.println(name);
    }

    public ChangableClass() {
    }
}
