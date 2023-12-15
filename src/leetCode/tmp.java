package leetCode;

import java.util.Optional;

public class tmp {
    public static void main(String[] args) {
        Integer t = null;
        int x = Optional.ofNullable(t).orElse(0);
        System.out.println(x);
    }
}
