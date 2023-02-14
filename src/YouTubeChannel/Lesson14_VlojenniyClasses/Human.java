package YouTubeChannel.Lesson14_VlojenniyClasses;

public class Human {
    public Head head;

    public Human() {
        this.head = new Head();
    }
    public void say () {
        System.out.println("мой голос " + head.voice);
    }
    class Head {
        String voice = "тонкий";
    }
}
