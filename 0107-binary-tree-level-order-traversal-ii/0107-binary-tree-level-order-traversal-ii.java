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
    List<List<Integer>> output = new ArrayList<>();
    
    public void helper(TreeNode current,int level)
    {
        if(output.size()==level)
        {
            output.add(new ArrayList<>());
        }
       
        output.get(level).add(current.val);
        
        if(current.left != null)
        {
        helper(current.left,level+1);
        }
        if(current.right != null)
        {
        helper(current.right,level+1);
        }
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return output;
        
        helper(root,0);
        Collections.reverse(output);
        return output;
    }
}