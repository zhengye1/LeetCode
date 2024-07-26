package vincent.leetcode.twoSumSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1
 */
public class TwoSumSolution {
    /**
     * 2ms runtime
     **/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (targetMap.containsKey(diff)) {
                return new int[] {targetMap.get(diff), i};
            }
            targetMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public int[] twoSumBest(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[] {left, right};
            }

            for (int j = left + 1; j < right; j++) {
                if (nums[j] + nums[left] == target) {
                    return new int[] {left, j};
                }
                if (nums[j] + nums[right] == target) {
                    return new int[] {j, right};
                }
            }
            right--;
        }

        return new int[0];
    }
}
