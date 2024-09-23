package book_designPatterns._5_Singelton._4_Stat;

public class SingletonTest {
    private static SingletonTest uniqueInstance;
    // Экзмепляр синглтон создается в статическом инициализаторе. Потоковая безопасность этого метода гарантирована!

    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        if (uniqueInstance == null) {
            try {
                // добавляем задержку, что б создать гоночную ситуацию
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uniqueInstance = new SingletonTest();
        }
        return uniqueInstance;
        // Экземпляр уже существует, просто возвращаем его
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a non-synchronized Singleton!";
    }
}
