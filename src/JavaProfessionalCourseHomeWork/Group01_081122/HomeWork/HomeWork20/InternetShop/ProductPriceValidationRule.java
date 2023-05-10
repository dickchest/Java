package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

public class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price should be more then 0", "price");
        }
    }
}
