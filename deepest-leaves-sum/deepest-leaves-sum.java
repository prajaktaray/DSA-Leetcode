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
    int sum = 0;
    int high =0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return sum;
        dfs(root,0);
        return sum;        
    }
    private void dfs(TreeNode root,int level){
        if(root == null) return;
        if(root.left ==null && root.right ==null){
            if(level == high){
                sum+= root.val;
            }else if(level > high){
                high=level;
                sum = root.val;
            }else return;
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}