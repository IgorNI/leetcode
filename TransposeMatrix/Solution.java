package com.udacity.android.myapplication;

/**
 * 转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 *
 * 思路和算法
 * 尺寸为 R x C 的矩阵 A 转置后会得到尺寸为 C x R 的矩阵 ans，对此有 ans[c][r] = A[r][c]。
 * 让我们初始化一个新的矩阵 ans 来表示答案。然后，我们将酌情复制矩阵的每个条目。
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] b = new int[c][r];
        for (int i=0; i < r; i++) {
            for(int j=0; j<c ; j++) {
                b[j][i] = A[i][j];
            }
        }
        return b;
    }
}
