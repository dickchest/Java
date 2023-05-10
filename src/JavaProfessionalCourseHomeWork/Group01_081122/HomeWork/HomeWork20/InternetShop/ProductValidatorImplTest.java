package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.InternetShop;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.List;
/*
К названию продукта выдвигаются следующие требования:
- RULE-1: не должно быть пустым
- RULE-2: не должно быть короче 3 символов
- RULE-3: не должно быть длиннее 100 символов
- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- RULE-5: не должна быть пустой
- RULE-6: должна быть больше 0

К описанию продукта выдвигаются следующие требования:
- RULE-7: не должно быть длиннее 2000 символов
- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
 */
public class ProductValidatorImplTest {
    ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    private ProductValidator validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) throws NoSuchMethodException {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.rule9_v1();

    }

    private void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_v1.size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1.getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), "rule1.getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1.getDescription");
    }

    private void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_v2.size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1.getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), "rule1.getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1.getDescription");
    }

    private void rule2_v1() {
        Product product = new Product("12", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2_v1.size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2.getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), "rule2.getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be less then three symbols"), "rule2.getDescription");
    }

    private void rule3_v1() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            str.append("a");
        }
        String title = String.valueOf(str);
        System.out.println(title);
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3_v1.size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3.getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), "rule3.getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be more then 100 symbols"), "rule3.getDescription");
    }

    private void rule4_v1() {
        Product product = new Product("asdbASDфы123в", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4_v1.size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4.getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), "rule4.getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Title should be consisted only from english symbols"), "rule4.getDescription");
    }

    private void rule5_v1() throws NoSuchMethodException {
        Method method = MethodHandles.lookup().lookupClass()
                .getDeclaredMethod(Thread.currentThread().getStackTrace()[1].getMethodName());
        String testName = method.getName();
        Product product = new Product("title123", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, testName+".size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), testName+".getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("price"), testName+".getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), testName+ ".getDescription");
    }

    private void rule6_v1() throws NoSuchMethodException {
        Method method = MethodHandles.lookup().lookupClass()
                .getDeclaredMethod(Thread.currentThread().getStackTrace()[1].getMethodName());
        String testName = method.getName();
        Product product = new Product("title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, testName+".size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), testName+".getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("price"), testName+".getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Price should be more then 0"), testName+ ".getDescription");
    }

    private void rule7_v1() throws NoSuchMethodException {
        Method method = MethodHandles.lookup().lookupClass()
                .getDeclaredMethod(Thread.currentThread().getStackTrace()[1].getMethodName());
        String testName = method.getName();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 2001; i++) {
            str.append("a");
        }
        String description = String.valueOf(str);
        System.out.println(description);
        Product product = new Product("title", 123, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, testName+".size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), testName+".getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("description"), testName+".getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be more then 2000 symbols"), testName+ ".getDescription");
    }

    private void rule8_v1() throws NoSuchMethodException {
        Method method = MethodHandles.lookup().lookupClass()
                .getDeclaredMethod(Thread.currentThread().getStackTrace()[1].getMethodName());
        String testName = method.getName();

        Product product = new Product("title", 123, "descriptionфвыа");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, testName+".size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), testName+".getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("description"), testName+".getFileName");
        checkResult(exceptions.get(0).getDescription().equals("Description should be consisted only from english symbols"), testName+ ".getDescription");
    }

    private void rule9_v1() throws NoSuchMethodException {
        Method method = MethodHandles.lookup().lookupClass()
                .getDeclaredMethod(Thread.currentThread().getStackTrace()[1].getMethodName());
        String testName = method.getName();

        Product product = new Product("ффва", 0, "descriptionфвыа");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, testName+".size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), testName+".getRuleName");
        checkResult(exceptions.get(0).getFileName().equals("title"), testName+".getFileName");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-6"), testName+".getRuleName");
        checkResult(exceptions.get(1).getFileName().equals("price"), testName+".getFileName");
        checkResult(exceptions.get(2).getRuleName().equals("RULE-8"), testName+".getRuleName");
        checkResult(exceptions.get(2).getFileName().equals("description"), testName+".getFileName");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
