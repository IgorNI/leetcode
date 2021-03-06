/**
 * leetcode 485. 最大连续1的个数
 * 
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * 
 * 示例 1:
 * 输入: [1,1,0,1,1,1] 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,one=0;
        for (int i : nums) {
            if(i==1) {
                one++;
            }else {
                one=0;
            }
            if(one > max) {
                max = one;
            }
        }
        return max;
    }
}
