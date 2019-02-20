/**
 * leetcode 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 *
 * 原题地址：https://leetcode-cn.com/problems/unique-paths/
 */

// 动态规划，将问题简化为cost[i][j] = cost[i-1][j] + cost[i][j-1]
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] totalNum = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i ==0 || j==0) {
                    totalNum[i][j] = 1; // 赋值
                }else {
                    totalNum[i][j] = totalNum[i-1][j] + totalNum[i][j-1];
                }
            }
        }
        return totalNum[m-1][n-1];
    }
}
