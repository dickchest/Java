package book_designPatterns._6_Command._6_dinner;

public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
        System.out.println("Customer calls for waitress...");
    }

    public void createOrder(Order order) {
        this.order = order;
        System.out.println("Customer crating the order.");
    }

    public void hungry() {
        System.out.println("Hey! I'm hungry! Bring me please my order!!!");
        waitress.takeOrder(order);
    }
}
