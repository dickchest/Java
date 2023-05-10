package JavaProfessionalCourseHomeWork.Group01_081122.HomeWork.HomeWork20.level_3_junior;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }
    /*
    NullPointerException возникает в том случае,
    когда программа пытается обратиться к объекту,
    который имеет значение null.
    В данном примере мы попытались вызвать метод length()
    у объекта str, который имеет значение null,
    что приводит к возникновению исключения.
     */
}
