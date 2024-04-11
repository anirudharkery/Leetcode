/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private ListNode MiddleToBST(ListNode head) {
        ListNode prev = null;
        ListNode slowptr = head;
        ListNode fastptr = head;
        
        while(fastptr != null && fastptr.next != null)
        {
            prev= slowptr;
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
       
        if(prev != null)
        {
            prev.next=null;
        }
        return slowptr;
        
    }
    public TreeNode sortedListToBST(ListNode head) {
         if(head == null)
            return null;
  
        
        ListNode mid = MiddleToBST(head);
        TreeNode node =  new TreeNode(mid.val);
        
              if(head == mid)
            return node;
        
        node.left = sortedListToBST(head);    
        node.right = sortedListToBST(mid.next);
        return node;
    }
}