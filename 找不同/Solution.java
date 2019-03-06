/**
 * leetcode 389. 找不同
 * 
 * 原题地址：https://leetcode-cn.com/problems/find-the-difference/
 *  给定两个字符串 s 和 t，它们只包含小写字母
 *  字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *  请找出在 t 中被添加的字母。
 * 
 *  示例:
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 * 
 * 解释：
 * 'e' 是那个被添加的字母
 */

class Solution {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        char ti = tt[0];
        for(int i = 0;i<ss.length;i++) {
            // 异或本身等于0
            ti ^= ss[i];
            ti ^= tt[i+1];
        }
        return ti;
    }
}
