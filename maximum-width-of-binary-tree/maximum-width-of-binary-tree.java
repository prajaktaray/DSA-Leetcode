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
    class Node{
        private TreeNode treenode;
        private int index;
        Node(TreeNode treenode,int index){
            this.treenode =treenode;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int width=0;
        if(root==null)return width;
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(root,0));
        int min=0,max=0;
        while(!q.isEmpty()){
            int size=q.size();
            //int temp=0;
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(i==0)min=curr.index;
                if(i==size-1) max=curr.index;
                if(curr.treenode.left!=null) q.add(new Node(curr.treenode.left,curr.index*2+1));
                if(curr.treenode.right!=null) q.add(new Node(curr.treenode.right,curr.index*2+2));
            }
            width=Math.max(width,(max-min+1));
        }
        return width;
    }
}