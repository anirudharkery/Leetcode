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
    List<Integer> output = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        int mindistance = Integer.MAX_VALUE;
        inorder(root);
        for(int i=1;i<output.size();i++)
        {
        mindistance = Math.min(mindistance,output.get(i)-output.get(i-1));
        }
        return mindistance;
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return ;
        inorder(root.left);
        output.add(root.val);
        inorder(root.right);
            
    }
}