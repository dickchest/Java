package leetCode;

public class _27_RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int k = removeElement(arr, 3);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("k = " + k);
    }


    public static int removeElement(int[] nums, int val) {
        int markLast = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                if (markLast != i) {
                    nums[i] = nums[markLast];
                }
                markLast--;
            }
        }
        return ++markLast;
    }
}
