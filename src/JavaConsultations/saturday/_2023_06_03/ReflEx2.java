package JavaConsultations.saturday._2023_06_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflEx2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName("JavaConsultations.saturday._2023_06_03.Emp");

        Field field = empClass.getField("id");
        System.out.println("Field type is: " + field.getType());
        System.out.println("-----------------------------------------------------");

        Field[] fields = empClass.getFields();
        for (Field f : fields) {
            System.out.println("Type of " + f.getName() + " : " + f.getType());
        }
        System.out.println("-----------------------------------------------------");

        Field[] allFields = empClass.getDeclaredFields(); // все поля включая приватные
        for (Field allField : allFields) {
            System.out.println("Type of " + allField.getName() + " : " + allField.getType());
        }
        System.out.println("-----------------------------------------------------");

        Method method = empClass.getMethod("increaseSalary");
        System.out.println("Return type is: " + method.getReturnType());
        System.out.println("-----------------------------------------------------");

        Method method1 = empClass.getMethod("setSalary", double.class);
        System.out.println("Return type is: " + method1.getReturnType());
        System.out.println("Paramentr type is: " + Arrays.toString(method1.getParameterTypes()));
        System.out.println("-----------------------------------------------------");

        Constructor constructor = empClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has: " + constructor.getParameterCount());
        System.out.println("Constructor param: " + Arrays.toString(constructor.getParameterTypes()));
        System.out.println("-----------------------------------------------------");

        Constructor[] constructors = empClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor: " + c.getName());
            System.out.println("Constructor type: " + Arrays.toString(c.getParameterTypes()));
        }

    }
}
