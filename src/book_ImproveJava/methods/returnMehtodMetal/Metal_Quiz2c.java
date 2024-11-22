package book_ImproveJava.methods.returnMehtodMetal;

public class Metal_Quiz2c {
    public double getPrice(String metal) {
        double price = 15;

        if (metal == "GD") { // gold
            price += 2000;
        } else if (metal == "SV") { // silver
            price = +25;
        } else if (metal == "CP") { // copper
            price += 3;
        } else {
            price -= 5;
        }
        return price;
    }

    public static void main(String[] args) {
        Metal_Quiz2c metal = new Metal_Quiz2c();
        double price = metal.getPrice("GD");
        System.out.println(price);
    }
}
