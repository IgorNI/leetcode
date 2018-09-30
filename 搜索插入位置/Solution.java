/**
 * leetcode 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 * 
 *
 * 输入: [1,3,5,6], 5  输出: 2
 */


// 遍历数组，若target >= nums[i],则i是位置；若target<nums[i],则继续遍历
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int result = 0; 
        while(i < n) {
            if(nums[i] >= target) {
                return i;
            }else if(nums[i] < target) {
                i++;
                continue;
            }
        }
        return n;
    }
}
