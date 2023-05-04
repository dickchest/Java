package JavaProfessionalCourse2.Lesson19.Generics.Generics3;

import JavaCourse.Lesson5.Paper;

public class MyNonGenericPaperHandle implements GarbageHandler<Paper, MyPaperHandleMethod>{
    @Override
    public void handle(Paper what, MyPaperHandleMethod how) {

        // здесь что-то делается с бумажным мусором способом MyPaperHandleMethod
    }

    @Override
    public <E> void transfer(E dangerousWaste) {

    }
}
