package JavaProfessionalCourseHomeWork.HomeWork5_Arrays.Level2.Exercise5BattleOfTheShips;

public enum Ships {
    ONE(4),
    TWO(3),
    THREE(2),
    FOUR(1);

    private int shipQuantity;

    Ships(int shipQuantity) {
        this.shipQuantity = shipQuantity;
    }

    public int getShipQuantity() {
        return shipQuantity;
    }
}
