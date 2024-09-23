package book_designPatterns._5_Singelton._5_dcl;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    // волаиль гарантирует, что параллельные потоки будут правильно работать с переменной uniqueInstance
    // при ее инициализации экземпляром Синглтон

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
