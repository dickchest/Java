package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

public class ProductDescriptionValidationRule implements FieldValidationRule{
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() >2000) {
            throw new ValidationException("RULE-7", "Description can not be more then 2000 symbols", "description");
        }
        if(!product.getDescription().matches("^[A-Za-z0-9]*$")) {
            throw new ValidationException("RULE-8", "Description should be consisted only from english symbols", "description");
        }
    }
}
