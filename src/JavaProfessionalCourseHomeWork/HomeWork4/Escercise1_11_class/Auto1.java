package JavaProfessionalCourseHomeWork.HomeWork4.Escercise1_11_class;

public abstract class Auto1 implements Moverbale{

    private Tire[] tires = new Tire[4];

    abstract void drive();
    abstract void start();
    abstract void broke();
}
