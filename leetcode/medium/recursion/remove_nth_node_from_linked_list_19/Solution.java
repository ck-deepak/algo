/**
    Time complexity : O(n)
    Space complexity : O(1)
    
    realization to make is n is the position, from the back,
    of the node to edit, not the removal node.
 
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // if element to remove is the first node
        if (getDepth(n, head) == 0) {
            head = head.next;
        }
        return head;
    }
    
    private int getDepth(int n, ListNode node) {
        
        // once at the end, minus position from the back of n by 1
        if (node.next==null) {
            return n-1;
        }
        
        n = getDepth(n, node.next);
        
        // once at the position to remove, set next next at insert node
        if(n==0){
            // just need to check if node.next is not null
            if(node.next != null){
                // if next.next is null that means last element was removed
                node.next = node.next.next;
            }
        }
        
        // decrease n by 1 to be set as the new n value each time we backtrack
        return n-1;   
    }
}
