package JavaProfessionalCourseHomeWork.HomeWork16.Level1.Exercise6;

public class Main {
    /*
    6. Переделайте MyLinkedList из одной из предыдущих домашек, чтобы он был generic class
     */
    public static void main(String[] args) {
        MyLinkedListGeneric<String> str = new MyLinkedListGeneric<>();
        str.add("asd");
        str.add("123");
        System.out.println(str.get(1));
        System.out.println(str.size());

        System.out.println("---");

        MyLinkedListGeneric<Integer> inter = new MyLinkedListGeneric<>();
        inter.add(1);
        inter.add(2);
        inter.add(3);
        System.out.println(inter.get(1));
        System.out.println(inter.size());
    }
}
