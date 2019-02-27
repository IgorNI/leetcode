/**
 * leetcode 136. 只出现一次的数字
 * 
 * 原题链接：https://leetcode-cn.com/problems/single-number/
 */

// 第一种方法，异或法，由于数组中只有一个数字出现过一次，将所有数字异或，最后的结果就是只出现一次的数字
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i =0;i<n;i++) {
            result = result^nums[i];
        }
        return result;
    }
}

