package book_ImproveJava.methodReverence;

public class MainApp_ConstructorReferences {
    public static void main(String[] args) {
        // constructor reference with functional interface
        ConstructorInterface constructorRef = Country_ConstructorReferences::new;

        /*
        Creating an instance of a Country class
        with a constructor reference
         */

        Country_ConstructorReferences instance = constructorRef.create("Constructor Ref");
        // Display the value from the created instance
        System.out.println("\nName:" + instance.getName());
    }
}
