package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
