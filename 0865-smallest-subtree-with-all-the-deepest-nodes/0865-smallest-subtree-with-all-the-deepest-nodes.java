/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode ans = null;
    int maxDepth = -1;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth(root,0);
        return ans;
    }
    private int depth(TreeNode root,int len){
        if(root==null) return len;
        int left = depth(root.left,len+1);
        int right = depth(root.right,len+1);
        if(left==right &&left>=maxDepth){
            maxDepth = left;
            ans = root;
        }
        return Math.max(left,right);
    }
}