package JavaConsultations.Pattern.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        m1(()-> {
                System.out.println("!!!!");
    });
    }

    public static void m1(I i) {
        System.out.println("@@@@");
        i.get();
    }
}
@FunctionalInterface
interface I {
    void get();
}