/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    class Node{
        TreeNode node;
        int index;
        Node(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int maxwidth =0;
        if(root ==null) return maxwidth;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root,0));
        int min=0;
        int max=0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i =0;i<size;i++){
                Node curr = q.poll();
                if(i==0) min = curr.index;
                if(i==size-1) max = curr.index;
                if(curr.node.left !=null) q.add(new Node(curr.node.left, 2*curr.index +1));
                if(curr.node.right !=null) q.add(new Node(curr.node.right, 2*curr.index +2));
            }
            maxwidth = Math.max(maxwidth,(max-min+1));
        }
        return maxwidth;
    }
}
