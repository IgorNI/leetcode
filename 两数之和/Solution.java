/**
 * leetcode 1. 两数之和
 * 
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。 
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                results[0] = map.get(nums[i]);
                results[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return results;
    }
}
