package book_ImproveJava._7_Encapsulation.ex2_VolleyballTeam;

public class Player {
    private String name;
    private int age;
    private double height;
    private int experience;

    public Player(String name, int age, double height, int experience) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.experience = experience;
    }

    public void getResult() {
        if (height >= 185.00 && age > 18 && age< 25 && experience >= 2) {
            System.out.printf("%s is accepted", name);
        } else {
            System.out.printf("%s is rejected", name);
        }
    }
    
    public void printAll() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Experience: " + experience);
    }
}
