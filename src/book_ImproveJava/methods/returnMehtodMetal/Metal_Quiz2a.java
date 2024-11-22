package book_ImproveJava.methods.returnMehtodMetal;

public class Metal_Quiz2a {
    public double getPrice(String metal) {
        double price = 15;

        if (metal.equals("GD")) { // gold
            price += 2000;
        } else if (metal.equals("SV")) { // silver
            price = +25;
        } else if (metal.equals("CP")) { // copper
            price += 3;
        } else {
            price -= 5;
        }
        return price;
    }

    public static void main(String[] args) {
        Metal_Quiz2a metal = new Metal_Quiz2a();
        double price = metal.getPrice(null);
        System.out.println(price);
    }
}
