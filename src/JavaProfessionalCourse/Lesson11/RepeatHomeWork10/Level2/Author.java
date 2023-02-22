package JavaProfessionalCourse.Lesson11.RepeatHomeWork10.Level2;

import org.jetbrains.annotations.NotNull;

public class Author implements Comparable<Author>{
    private String name;


    @Override
    public int compareTo(@NotNull Author o) {
        return this.name.compareTo(o.name);
    }
}
