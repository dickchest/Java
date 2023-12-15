package leetCode;

import java.util.*;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] inputArray = new int[]{3, 2, 4};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(inputArray, target)));
        System.out.println(Arrays.toString(twoSumHashTable(inputArray, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("" + i + j);
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] twoSumHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

