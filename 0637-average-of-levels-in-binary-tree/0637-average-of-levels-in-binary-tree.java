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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
               double sum=0;
        while(!queue.isEmpty())
        {
             int n = queue.size();
            for(int i=0;i<n;i++)
            {
                TreeNode node = queue.poll();
                sum += node.val;
                    if(node.left != null)
                    {
                        queue.add(node.left);
                    }
                  if(node.right != null)
                    {
                        queue.add(node.right);
                    }
            }
            
        result.add(sum/n);
            sum=0;
            }
        return result;
    }
}