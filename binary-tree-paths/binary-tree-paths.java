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
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return result;
        helper(root,"");
        return result;
    }
    private void helper( TreeNode root,String curr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            String temp = curr+ root.val;
            result.add(temp);
        }
        helper(root.left, curr+ root.val+"->");
        helper(root.right, curr+ root.val +"->");
    }
}