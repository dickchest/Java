package JavaCourse.Lesson5;

public class Paper {

    private String content = "";
    public void writeName(String name) {
        content += name + " ";
    }

    public String getContent() {
        return content;
    }
}
