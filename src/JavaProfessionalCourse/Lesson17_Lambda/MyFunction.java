package JavaProfessionalCourse.Lesson17_Lambda;

@FunctionalInterface
public interface MyFunction {
    int apply (int x, int y);
    // 1 abstract Method

    default int apply(int x) {
        return x + 1;
    }

    static int applyTriple(int x, int y, int z) {
        return x + y+ z;
    }
}
