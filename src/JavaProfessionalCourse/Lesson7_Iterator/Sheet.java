package JavaProfessionalCourse.Lesson7_Iterator;

public class Sheet {
    private String text;
    private int page;

    public Sheet(String text, int page) {
        this.text = text;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Sheet{" +
                "text='" + text + '\'' +
                ", page=" + page +
                '}';
    }

    public String getText() {
        return text;
    }

    public int getPage() {
        return page;
    }
}
