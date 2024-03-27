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
    public int deepestLeavesSum(TreeNode root) {
        int deepestsum=0;
        int depth=0;
        int currentdepth;
        Deque<Pair<TreeNode,Integer>> stack = new ArrayDeque<>();
        stack.push(new Pair(root,0));
        
        while(!stack.isEmpty())
        {
            Pair<TreeNode,Integer> p = stack.pop();
            root = p.getKey();
            currentdepth = p.getValue();
            
            if(root.left == null && root.right == null)
            {
                if(depth < currentdepth)
                {
                    deepestsum = root.val;
                    depth = currentdepth;
                }
                else  if(depth == currentdepth)
                {
                    deepestsum += root.val;
                }
            }
            else
            {
                 if(root.right != null)
                {
                    stack.push(new Pair(root.right,currentdepth+1));
                }
                 if(root.left != null)
                {
                    stack.push(new Pair(root.left,currentdepth+1));
                }
            }
        }
        return deepestsum;
        
    }
}