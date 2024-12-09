package leetCode;

public class _70_ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairsSol1(10));
    }

    public static int climbStairsSol1(int n) {
        if (n <= 3) return n;

        int cur = 0;
        int prev1 = 3;
        int prev2 = 2;

        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }

    public static int climbStairs(int n) {
        int k = 0;
        return climbRecurs(n, k);
    }

    private static int climbRecurs(int n, int k) {
        if (n == 1) return k + 1;
        if (n == 2) return k + 2;
        return k + climbRecurs(n-1, k) + climbRecurs(n-2, k);
    }


}
