package leetCode;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
public class _35_SearchInsertPoint {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int middle = l + (r - l) / 2;

            if (nums[middle] == target) return middle;

            if (target > nums[middle]) {
                l = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        return l;
    }
}
