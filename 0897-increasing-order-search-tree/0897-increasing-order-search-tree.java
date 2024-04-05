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
    public TreeNode increasingBST(TreeNode root) {
    List<Integer> value = new ArrayList<>(); 
        TreeNode pre = new TreeNode(0);
        TreeNode curr = pre;   
        inorder(root,value);
        for(int v : value)
        {
            curr.right = new TreeNode(v);
            curr = curr.right;
        }
        return pre.right;
    }
    public void inorder(TreeNode root,List<Integer> value)
    {
        if(root == null)
            return;
        
        inorder(root.left,value);
        value.add(root.val);
        inorder(root.right,value);
    }
}