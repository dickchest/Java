package book_designPatterns._5_Singelton._6_enum;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton.getDescription());
    }
}
