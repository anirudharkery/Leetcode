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
    int preindex=0;
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<postorder.length;i++)
        {
            mp.put(postorder[i],i);
        }
        return helper(preorder,postorder,mp,0,postorder.length-1);
    }
    
    private TreeNode helper(int[] pre,int[] post,Map<Integer,Integer> mp,int start,int end)
    {
        if(start > end)
        {
            return null;
        }
        TreeNode root = new TreeNode(pre[preindex++]);
        
        if(start==end)
            return root;
        
        int index = mp.get(pre[preindex]);
        
        root.left = helper(pre,post,mp,start,index);
        root.right = helper(pre,post,mp,index+1,end-1);
        return root;
            
    }
}

