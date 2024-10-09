package book_designPatterns._5_Singelton._6_enum;

import JavaProfessionalCourse2.Lesson19.Generics.Generics5.PairUniversal;

public enum Singleton {
    UNIQUE_INSTANCE;

    public  String getDescription() {
        return "I'm a thread safe Singleton";
    }

}
