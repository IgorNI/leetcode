/**
 * leetcode 234. 回文链表
 * 
 * 原题链接： https://leetcode-cn.com/problems/palindrome-linked-list/
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1: 
 * 输入: 1->2
 * 输出: false
 * 
 * 示例 2: 
 * 输入: 1->2->2->1
 * 输出: true
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null)
        return true;
    ListNode fast = head;
    ListNode slow = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode reverseHead = reverseList(slow.next);

    while (head != null && reverseHead != null) {
        if (head.val != reverseHead.val)
            return false;
        head = head.next;
        reverseHead = reverseHead.next;
    }
    return true;
}

public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
        return head;
    ListNode p = null;
    ListNode q;
    while (head != null) {
        q = head.next;
        head.next = p;

        p = head;
        head = q;
    }
    return p;
}
}