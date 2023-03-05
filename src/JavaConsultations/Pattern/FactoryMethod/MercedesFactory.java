package JavaConsultations.Pattern.FactoryMethod;

public class MercedesFactory extends AbstractCarFactory {
    @Override
    Car getCar() {
        return new Mercedes();
    }
}
