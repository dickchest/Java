package JavaProfessionalCourse.Lesson8LinkedList;

public class Bitwise {
    public static void main(String[] args) {
        // 125 -> 111 1101
        // нужно поделить на 2
        // 125 /2 = 62(1)
        // move 0111 110 - битовый сдвиг
        // 00111 11 - 31
        int i = 125;
        i= i>>1; // 125/2
        System.out.println(i);
        i= i>>2; // 125/4
        i= i>>3; // 125/8

        // умножение - побитовы сдвиг вправо
        i = i<<1;

    }
}
