package JavaProfessionalCourse.Lesson16_Record;

import java.util.List;

public class Archive<T, S extends Number> {
    List<T> myArchive;
    S size;


    public void add(T value) {
        myArchive.add(value);
    }

    public void addN(S n) {
        n.intValue();
        size = n;
    }

}
