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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> currResult = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                currResult.add(curr.val);
                if(curr.left !=null)q.add(curr.left);
                if(curr.right !=null)q.add(curr.right);
            }
            result.add(currResult);            
        }
        return result;
        
    }
}