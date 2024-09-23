package book_designPatterns._5_Singelton._4_Stat;

public class Main {
    public static void main(String[] args) {
        SingletonTest singleton = SingletonTest.getInstance();
        SingletonTest singleton2 = SingletonTest.getInstance();

        System.out.println(singleton.getDescription());

        System.out.println(singleton == singleton2);
    }
}
