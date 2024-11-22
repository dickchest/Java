package book_ImproveJava.methods.varargsMethods;

public class IqPeople_Ex5 {
    // varargs arguments
    void write(int iq, String... names) {
        System.out.println("\nIQ " + iq + ":");

        for (String str: names) {
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        IqPeople_Ex5 iqPeople = new IqPeople_Ex5();
        // one argument demo
        iqPeople.write(150);

        // two argument demo
        iqPeople.write(200, "Emma");

        // three argument demo
        iqPeople.write(220, "David", "Vera");

        // five argument demo
        iqPeople.write(300, "Einstein", "Newton", "Darwin", "Tesla");
    }
}
