package book_designPatterns._5_Singelton._3_Threadsafe;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton.getDescription());

        System.out.println(singleton == singleton2);
    }
}
