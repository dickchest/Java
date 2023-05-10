package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

public class ValidationException extends Throwable{

    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;

    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fileName;

    public ValidationException(String ruleName, String description, String fileName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fileName = fileName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFileName() {
        return fileName;
    }
}
