/**
 * leetcode 137. 只出现一次的数字 II
 * 
 * 原题链接：https://leetcode-cn.com/problems/single-number-ii/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for(int i = 0;i < nums.length;i++)
        {
            // 00 -> 01 ->10 ->00，实现了遇到3次变为0的逻辑
            b = (b ^ nums[i]) & ~a;
            a = (a ^ nums[i]) & ~b;
        }
        return b;
    }
}

