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
    public int maxLevelSum(TreeNode root) {
      int maxint = Integer.MIN_VALUE;
        int level=0;
        int ans=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            level++;
            int current_sum = 0;
            for(int sz = q.size();sz>0;sz--)
            {
                TreeNode node = q.poll();
                current_sum += node.val;
                if(node.left != null)
                {
                q.offer(node.left);
                }
                if(node.right != null)
                {
                q.offer(node.right);
                }
            }
            if(current_sum > maxint)
            {
                maxint = current_sum;
                ans = level;
            }
        }
        
        return ans;
    }
}