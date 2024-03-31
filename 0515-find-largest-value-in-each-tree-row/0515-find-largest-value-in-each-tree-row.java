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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxval = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return maxval;
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            List<Integer> level = new ArrayList<>();
            int maxsize = Integer.MIN_VALUE;
            int n= queue.size();
            for(int i=0;i<n;i++)
            {
                TreeNode node = queue.poll();
                maxsize = Math.max(maxsize,node.val);
                if(node.left != null)
                {
                    queue.add(node.left);
                }
                 if(node.right != null)
                {
                    queue.add(node.right);
                }
            }
                    maxval.add(maxsize);
        }
        return maxval;
    }
}