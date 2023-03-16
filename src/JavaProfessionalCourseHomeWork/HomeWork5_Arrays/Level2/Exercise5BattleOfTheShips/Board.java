package JavaProfessionalCourseHomeWork.HomeWork5_Arrays.Level2.Exercise5BattleOfTheShips;

public interface Board {
    public void init();
    public void showBoard();

    public int getCell(Coordinates coordinates);
    public void setCell(ShotResult shotResult, Coordinates coordinates);
}
