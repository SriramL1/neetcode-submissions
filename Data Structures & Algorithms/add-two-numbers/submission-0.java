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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        // A pointer pointing to dummy
        ListNode curr = dummy;

        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            // read current digits of each list
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            // compute the sum
            int val = v1 + v2 + carry;
            // update the values
            carry = val / 10;
            val = val % 10;
            // append a new node containing digit
            curr.next = new ListNode(val);

            // move the pointers forward
            curr = curr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
    
        }
        return dummy.next;
    }
}
