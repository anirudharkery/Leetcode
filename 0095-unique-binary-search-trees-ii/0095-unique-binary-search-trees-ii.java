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
    public List<TreeNode> generateTrees(int n) {
      
        if(n==0)
            return new ArrayList<>();
        
        return helper(1,n);
    }
    public List<TreeNode> helper(int start,int end)
    {
        List<TreeNode> res = new ArrayList<>();
        if(start > end)
        {
            res.add(null);
            return res;
        }
        for(int i=start;i<=end;i++)
        {
            List<TreeNode> leftsubtree = helper(start,i-1);
            List<TreeNode> rightsubtree = helper(i+1,end);
            
            for(TreeNode left : leftsubtree)
            {
                for(TreeNode right : rightsubtree)
                {
                    TreeNode node = new TreeNode(i,left,right);
                    res.add(node);
                }
            }
            
        }
        return res;
    }
}