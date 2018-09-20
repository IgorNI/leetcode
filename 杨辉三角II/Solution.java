/**
 * leetcode 119. 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 输入: 3
 * 输出: [1,3,3,1]
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int t[][]=new int[rowIndex+1][];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<t.length;i++) {
            t[i]=new int[i+1];
            List<Integer> tempList = new ArrayList<>();
            for(int j=0;j<=i;j++){
        // 将两侧的数组元素赋值为1
        if(i==0||j==0||j==i){
          t[i][j]=1;
        }else{
          // 其他数值通过公式计算
          t[i][j]=t[i-1][j]+t[i-1][j-1];
        }
                tempList.add(t[i][j]);
        }
            list.add(tempList);
    }
        return list.get(rowIndex);
    }
}
