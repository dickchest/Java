package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

public class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().length() == 0) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be less then three symbols", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be more then 100 symbols", "title");
        }
        if(!product.getTitle().matches("^[A-Za-z0-9]*$")) {
            throw new ValidationException("RULE-4", "Title should be consisted only from english symbols", "title");
        }
    }
}
