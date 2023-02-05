package JavaCourse.Lesson3;

public class ExampleThree {
    public static void main(String[] args) {
//        char c = 200;
//        System.out.println(c);

        short sh = 10;
        byte bt = (byte) sh;
        int i = sh;
        sh = (short) i;
        long l = 2_000_000_000_000l;
//        i = (int)l;

        float f = i; // 10.0
        double d = f; // 10.0
        f = (float) d;

        d = 12.4999999;
        i = (int) Math.round(d); // округление
        System.out.println(i);
        System.out.println(Math.ceil(d)); // приведение в большую сторону
        System.out.println(Math.floor(d)); // приведение в меньшую сторону

        System.out.println(1.0 / 3); // double
        System.out.println((float) 1.0f / 3); // float
        System.out.println(500000000 * 6); // int по умолчанию
        System.out.println(500000000l * 6); // лонг по умолчаниею

        char ch = 'c'; // index = 99
        int x = ch; // x = 99
        System.out.println(x);

        ch = '9'; // index 57
        x = Integer.valueOf(ch + ""); // convert to string "9" -> to int = 9
        System.out.println(x);

        x = Integer.valueOf(ch); // index 57 > int 57; or equals  "x = ch"
        System.out.println(x);

        x = Character.getNumericValue(ch); // is symbol '9' a digit? int - 9
        System.out.println(x);

        String name = "den"; // 1
        name = "dennis"; // 2
//        System.out.println(Arrays.toString(name.toCharArray()));

        // String temp = new String(original: "new string"); // не будет лежать +в пуле констант
        String empty = "";

        String str = "string";
        System.out.println(str.length()); // возвращает длину строки
        System.out.println(str.length()); // возвращает длину строки

        System.out.println(str.charAt(0)); // возвращает первый символ
        System.out.println(str.charAt(str.length()-1)); // возвращает последний символ


        int[] nums = {1, 2, 3};
        System.out.println(nums);
        int[] nums2 = {1, 2, 3, 4};
        nums = nums2;
        System.out.println(nums2);

        String str1 = "string";
        System.out.println(str1.substring(0,3)); // получает подстроку от 1го символа, до последнего указанного, не включая последнего.

        System.out.println(str.isEmpty()); // boolean, true = if string empty, false = if not
        System.out.println(empty);

        // str.isBlank

        System.out.println("    str");
        System.out.println("    str".trim());

        System.out.println("StrSdfsSDF".toUpperCase()); //все символы заглавные
        System.out.println("StrSdfsSDF".toLowerCase()); //все символы строчные

        // сравнение строк
        System.out.println("str" == "str"); // boolean, true = if all symbols match, if not - false
        System.out.println("str".equals("str")); // boolean, true = if all symbols match
        System.out.println("str".equalsIgnoreCase("Str")); // boolean, true if


    }
}
