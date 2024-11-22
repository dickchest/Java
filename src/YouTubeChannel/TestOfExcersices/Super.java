package YouTubeChannel.TestOfExcersices;

class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.println("In Sub");
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
        System.out.println("-----");
        String str = " ";
        System.out.println(str.isBlank());
    }
}
