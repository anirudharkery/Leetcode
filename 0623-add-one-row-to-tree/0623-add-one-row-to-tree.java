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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
       
        if(depth == 1)
        {
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        insert(val,root,1,depth);
        return root;
    }
    
    public void insert(int v,TreeNode node,int d,int n)
    {
        if(node == null)
            return ;
        if(d == n-1)
        {
            TreeNode root = node.left;
            node.left = new TreeNode(v);
            node.left.left = root;
            root = node.right;
            node.right = new TreeNode(v);
            node.right.right = root;
        }
        else
        {
            insert(v,node.left,d+1,n);
            insert(v,node.right,d+1,n);
        }
    }
}