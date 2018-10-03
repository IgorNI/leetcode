/**
 * leetcode 717. 1比特与2比特字符
 * 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 *
 * 示例 1:
 * 输入: bits = [1, 0, 0]  输出: True. 解释: 唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
 *
 * 示例 2:
 * 输入: bits = [1, 1, 1, 0] 输出: False  解释: 唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
 */


class Solution {
    // 解法一：判断数组中的字符
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        if(n == 0 ) {
            return false;
        }
        if(bits[n-1] == 1) {
            // 若结尾是1，则最后一个字符不是一笔特字符
            return false;
        }
        while(i<n) {
            if(bits[i] == 0) {
                i++;
            }else{
                if((i+1) >= (n-1)) {
                    // 若下个字符是数组的最后一个字符，或者当前就是最后一个字符为1，则不是
                    return false;
                }else{
                    i = i+2;
                }
            }
        }
        return true;
    }
}

class Solution {
    // 解法二：利用i作为增量指针，碰到0，增1，碰到1，增2，最后判断i的大小与bits剩余长度是否相等。
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        if(n == 0 ) {
            return false;
        }
        if(bits[n-1] == 1) {
            // 若结尾是1，则最后一个字符不是一笔特字符
            return false;
        }
        for( i=0;i<n-1;i++){
           if(bits[i]==1){
               i += 1;
           }
       }
        return i == n -1;
    }
}
