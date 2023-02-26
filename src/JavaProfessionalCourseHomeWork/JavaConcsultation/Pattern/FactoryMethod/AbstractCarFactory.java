package JavaProfessionalCourseHomeWork.JavaConcsultation.Pattern.FactoryMethod;

public abstract class AbstractCarFactory {
    public void createCar() {
        Car car = getCar();
        car.drive();
    }
    abstract Car getCar();
}