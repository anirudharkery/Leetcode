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
    Map<Integer,Integer> mp = new HashMap<>();
    int[] preorder;
    int pre_idx = 0;
    public TreeNode helper(int start_idx,int end_idx)
    {
        if(start_idx == end_idx)
            return null;
        
        TreeNode root = new TreeNode(preorder[pre_idx]);
        int index = mp.get(preorder[pre_idx]);
        pre_idx++;
        root.left = helper(start_idx,index);
        root.right = helper(index+1,end_idx);
        return root;
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder;
         int[] inorder = Arrays.copyOf(preorder,preorder.length);
        Arrays.sort(inorder);
        
        int idx=0;
        for(int val : inorder)
        {
            mp.put(val,idx++);
        }
        
        return helper(0,preorder.length);
    }
}