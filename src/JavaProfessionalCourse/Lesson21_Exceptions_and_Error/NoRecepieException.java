package JavaProfessionalCourse.Lesson21_Exceptions_and_Error;

public class NoRecepieException extends RuntimeException{
    public NoRecepieException() {
        super("рецепта нет, не могу купить ингридиенты");
    }
}
