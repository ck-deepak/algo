/**

   Time complexity: O(N+M)
   Space complexity: O(1)
   
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        // key is to use the prev to traverse both lists and return the final answer as the node linked to prev.next
        ListNode prev = prehead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        // At least one of l1 and l2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = list1 == null ? list2 : list1;

        return prehead.next;
    }
}
