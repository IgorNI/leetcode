/**
 * leetcode 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 输入: [1,2,3,1]  输出: true
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j = i -1 ;j>=0;j--) {
              if (nums[i] > nums[j]) {
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
