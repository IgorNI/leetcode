/**
 * leetcode 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 输入: 5
     输出:
     [
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
     ]
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int t[][]=new int[numRows][];
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
        return list;
    }
}
