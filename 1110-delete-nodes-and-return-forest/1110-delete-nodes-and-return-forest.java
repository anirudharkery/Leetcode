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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    List<TreeNode> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int[] hash = new int[1001];
        for (int x : to_delete) {
            hash[x] = 1;
        }
        root = deleteHelper(root, hash, res);
        if (root != null) {
            res.add(root);
        }
        return res;
    }

    TreeNode deleteHelper(TreeNode root, int[] hash, List<TreeNode> res) {
        if (root == null) {
            return root;
        }
        root.left = deleteHelper(root.left, hash, res);
        root.right = deleteHelper(root.right, hash, res);

        if (hash[root.val] == 1) {
            if (root.left != null) {
                res.add(root.left);
                root.left = null;
            }
            if (root.right != null) {
                res.add(root.right);
                root.right = null;
            }
            return null;
        }
        return root;
    }
}