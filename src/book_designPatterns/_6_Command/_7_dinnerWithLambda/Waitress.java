package book_designPatterns._6_Command._7_dinnerWithLambda;

public class Waitress {
    Order order;
    public Waitress() {
    }

    public void takeOrder(Order order) {
        System.out.println("Waitress took an order and bringing it to the cook");
        this.order = order;
        order.orderUp();
    }
}
