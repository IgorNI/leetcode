/**
 * leetcode 63. 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * https://leetcode-cn.com/problems/unique-paths-ii/
 */

// 动态规划，类似于leetcode 62，将问题简化为cost[i][j] = cost[i-1][j] + cost[i][j-1]，遍历数组时需要剔除障碍物，也就是1
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0;i<n;i++) {
            if(obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
            for(int j = 0;j<m;j++) {
                if(obstacleGrid[0][j] == 1) {
                break;
            }
            dp[0][j] = 1;
            }
            for(int i=1;i<n;i++) {
                for(int j=1;j<m;j++) {
                    if(obstacleGrid[i][j] == 0) {
                        // 只统计为0的路径
                        dp[i][j] = dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
        return dp[n-1][m-1];
    }
}
