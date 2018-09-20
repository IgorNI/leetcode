/**
 * leetcode 238. 除自身以外数组的乘积
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 * 示例: 输入: [1,2,3,4] 输出: [24,12,8,6]
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
class Solution {
    // 如果一个数，你知道它前面所有数的乘积，以及他后面所有数的乘积，那这两个乘积相乘就是所得的结果 
    // 所以将它左边所有的数的乘积放在一个数组fwd[]，它右边所有数的乘积放一个数组bwd[]，然后两个数组对应位置相乘就是目标数组
    // 时间复杂度为O(n),空间复杂度为O（n）
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] fwd = new int[n], bwd = new int[n];
        fwd[0] = 1; bwd[n - 1] = 1;
        for (int i = 1; i < n; ++i) {
            fwd[i] = fwd[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; --i) {
            bwd[i] = bwd[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; ++i) {
            res[i] = fwd[i] * bwd[i];
        }
        return res;
    }
}
