package book_ImproveJava;

public class Product1 {
    static double price = 20;

    public static void main(String[] args) {
        if (price == price++) {
            price++;
            if (price == price++) {
                ++price;
            }
        } else {
            price += 8;
        }
        System.out.println(price);
    }
}
