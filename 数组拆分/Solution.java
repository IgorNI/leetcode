/**
 * leetcode 561 数组拆分 I
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * 其中：n 是正整数,范围在 [1, 10000].
 *     数组中的元素范围在 [-10000, 10000].
 *
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        // 先将数组从小到大排序，从头开始两两成对，所得的min(ai, bi) 总和最大
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        int k = 0;
        while(k < n) {
            sum = sum+nums[k];
            k = k+2;
        }
        return sum;
    }
}
