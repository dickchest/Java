package JavaProfessionalCourseHomeWork.HomeWork5_Arrays.Level2.Exercise5BattleOfTheShips;

public class Coordinates {
    public  int x;
    public  int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
