/**
 * leetcode 53. 最大子序和
 * 
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例 1:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */

// 解法1：分治递归
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        return divide(nums, 0, n-1);
    }
    
    int divide(int[] nums, int l, int r) {
        if(l == r)  return nums[l];
        if(l == r-1) return Math.max(nums[l], Math.max(nums[r], nums[l]+nums[r]));
        
        int mid = (l+r)>>1;
        int lret = divide(nums, l, mid-1);
        int rret = divide(nums, mid+1, r);
        
        int mret = nums[mid];
        int sum = mret;
        for(int i = mid-1; i >= l ; i --) {
            sum += nums[i];
        //    if(sum < 0) sum = 0;
            mret = Math.max(mret, sum);
        }
        sum = mret;    //保存已经计算过的左边的最大子序和
        for(int i = mid+1; i <= r ; i ++) {
            sum += nums[i];
        //    if(sum < 0) sum = 0;
            mret = Math.max(mret, sum);
        }
        
        return Math.max(lret, Math.max(rret, mret));
    }
}

// 解法2: 遍历求和
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp= new int[n];
        
        //以第一个数字结尾的最大子串和
        dp[0] = nums[0];
        int max_sum = dp[0];
        
        for(int i=1; i<n; ++i)
        {
            dp[i] = dp[i-1]>0 ? dp[i-1]+nums[i] : nums[i];
            max_sum = Math.max(max_sum, dp[i]);
        }
        return max_sum;
    }
}