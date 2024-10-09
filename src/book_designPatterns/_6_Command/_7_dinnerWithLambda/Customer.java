package book_designPatterns._6_Command._7_dinnerWithLambda;

public class Customer {
    Waitress waitress;
    Order order;
    Cook cook;

    public Customer(Waitress waitress, Cook cook) {
        this.waitress = waitress;
        this.cook = cook;
        System.out.println("Customer calls for waitress...");
    }

    public void createOrder() {
        this.order = () -> {
            cook.makeBurger();
            cook.makeFries();
        };
        System.out.println("Customer crating the order.");
    }

    public void hungry() {
        System.out.println("Hey! I'm hungry! Bring me please my order!!!");
        waitress.takeOrder(order);
    }
}
