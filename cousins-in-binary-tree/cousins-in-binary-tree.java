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
    //dfs
    TreeNode parentX;
    TreeNode parentY;
    int depthX;
    int depthY;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root ==null) return false;
        dfs(root,0,null,x,y);
        return parentX != parentY && depthX== depthY;
        
    }
    private void dfs(TreeNode root,int depth,TreeNode parent,int x,int y){
        if(root==null) return;
        if(root.val==x){
            parentX = parent;
            depthX=depth;
        }
        if(root.val==y){
            parentY = parent;
            depthY=depth;
        }
        dfs(root.left,depth+1,root,x,y);
        dfs(root.right,depth+1,root,x,y);
        
    }
        
}