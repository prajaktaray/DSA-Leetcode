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
    public TreeNode invertTree(TreeNode root) {
        if(root ==null) return root;
        helper(root);
        return root;
    }
    private TreeNode helper(TreeNode root){
        
        if(root.left ==null && root.right == null) return root;
        TreeNode oldLeft = null;
        TreeNode oldRight = null;
        if(root.left !=null) oldLeft = helper(root.left);
        if(root.right !=null) oldRight = helper(root.right);
        root.left = oldRight;
        root.right = oldLeft;
        return root;
    }
}