package JavaProfessionalCourse.Lesson6.RepeatHomeWork5;

public class JavaTwoDimensionArray implements TwoDimensionalArray{

    private int[][] array;
    private int size;

    public JavaTwoDimensionArray(int size) {
        this.array = new int[size][size];
    }

    @Override
    public void print() {

    }

    @Override
    public TwoDimensionalArray add(TwoDimensionalArray array) {

        return array;
    }

    @Override
    public void minus(TwoDimensionalArray array) {

    }
}
