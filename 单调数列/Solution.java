/**
 * leetcode 896. 单调数列
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 *
 * 示例 1：
 * 输入：[1,2,2,3] 输出：true
 *
 * 示例 2：
 * 输入：[6,5,4,4] 输出：true
 *
 * 示例 3：
 * 输入：[1,3,2] 输出：false
 */
class Solution {
    public boolean isMonotonic(int[] A) {
        int n = A.length;
        int dizeng = 0; // 0代表非单调
        int dijian = 0;
        int equal = 0;
        for(int i =1;i<n;i++) {
            if(A[i-1] > A[i]) {
                dijian +=1;
            }else if(A[i-1] < A[i]) {
                dizeng +=1;
            } else if(A[i-1] == A[i]) {
                equal +=1;
            }
        }
        int sum = dijian*dizeng;
        if(sum == 0 ) {
            // 递增与递减的值只有一个是大于0
            return true;
        }else{
            return false;
        }
    }
}
