/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null)
        {
            return output;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> level = new ArrayList<>();
            int n = queue.size();
            for(int i=0;i<n;i++)
            {
                  Node node = queue.poll();
                  level.add(node.val);
                  queue.addAll(node.children);
            }
                  output.add(level);   
        }
        return output;
    }
}