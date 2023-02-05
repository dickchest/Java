package JavaCourse.Lesson10_Massives;

public class Two {
    public static void printArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3};
        printArray(ints);

        for(int i : ints) {
            System.out.println(i);
        }

        for(int i : ints) System.out.println(i);


    }
}
