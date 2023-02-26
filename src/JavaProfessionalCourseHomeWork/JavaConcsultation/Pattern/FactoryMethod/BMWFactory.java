package JavaProfessionalCourseHomeWork.JavaConcsultation.Pattern.FactoryMethod;

public class BMWFactory extends AbstractCarFactory{

    @Override
    Car getCar() {
        return new BMW();
    }
}
