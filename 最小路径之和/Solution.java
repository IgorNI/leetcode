/**
 * leetcode 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例 1:
 * 输入:
 *   [
 *     [1,3,1],
 *     [1,5,1],
 *     [4,2,1]
 *   ]
 *   输出: 7
 *   解释: 因为路径 1→3→1→1→1 的总和最小。
 */
class Solution {
    // 用递归
        private int[][] grid;
        private int sum;
        private int[][] dp;
    public int minPathSum(int[][] grid) {
        this.grid = grid;
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        return minPath(0,0);
}
    public int minPath(int x, int y) {
        if(x==grid.length-1&&y==grid[0].length-1){
                return grid[x][y];
            }
        if(x>grid.length-1||y>grid[0].length-1){
                return Integer.MAX_VALUE;
            }
        if(dp[x][y]!=0) {
            return dp[x][y];
        }
        dp[x][y] = grid[x][y] + Math.min(minPath(x+1, y),minPath(x,y+1));
        return dp[x][y];
    }
}
