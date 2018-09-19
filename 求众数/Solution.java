/**
 * leetcode 169. 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 * 输入: [3,2,3]  输出: 3
 *
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2] 输出: 2
 */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int s = 0;
        if(n % 2 == 0) {
            //偶数
            for(int i = 0; i< n/2;i++) {
                if(nums[i] == nums[i + n/2]) {
                    s = nums[i]; // 如果
                    break;
                }
            }
        }else {
            // 奇数
            for(int i = 0; i< n/2 + 1;i++) {
                if(nums[i] == nums[i + n/2]) {
                    s = nums[i]; // 如果
                    break;
                }
            }
        }
        return s;
    }
}
