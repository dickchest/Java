package book_designPatterns._6_Command._7_dinnerWithLambda;

public class Dinner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress, cook);
        customer.createOrder();
        customer.hungry();
    }
}
