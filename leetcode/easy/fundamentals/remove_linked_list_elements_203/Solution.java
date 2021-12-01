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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if (head==null) {
            return null;
        }
        
        while(head.val==val) {
              if (head.next==null) {
                  head=null;
                  return head;
              } else {
                  head = head.next;
              }
        }
        
        ListNode prevNode = head;
        ListNode curNode = head.next;
        while(curNode!=null) {
            // remove current node
            if (curNode.val==val) {
                prevNode.next = curNode.next==null?null:curNode.next;
            } else {
                prevNode = prevNode.next;
            }
            
            if (prevNode == null) {
                curNode = null;
            } else {
                curNode = prevNode.next==null?null:prevNode.next;
            }
        }
        return head;
    }
}
