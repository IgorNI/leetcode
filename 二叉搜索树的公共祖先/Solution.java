/**
 * leetcode 235. 二叉搜索树的最近公共祖先
 *
 * 原题地址：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 说明: 叶子节点是指没有子节点的节点。
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null || p == null || q == null){
            return null;
        }
        //处理p,q结点，让p结点的值小于q结点的值
        if(p.val > q.val){
            //如果p.val > q.val，交换两者值
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        
        TreeNode node=root;
        while(node != null){
            if(q.val < node.val){
                //最大值<当前节点，公共祖先在左子树上
                node= node.left;
            }else if(p.val >node.val){
                //最小值>当前节点，公共祖先在右子树上
                node= node.right;
            }else{
                return node;
            }
        }
        return null;
    }
}
