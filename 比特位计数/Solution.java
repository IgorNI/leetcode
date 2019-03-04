/**
 * leetcode 338. 比特位计数
 * 
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作
 * 为数组返回。
 *
 * https://leetcode-cn.com/problems/counting-bits/
 */


class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=1;i<=num;i++){
            res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}
