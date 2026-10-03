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
    public ListNode reverseList(ListNode head) {
        // initializers
       ListNode prev = null;
       ListNode curr = head;

        // while the current value exists
       while (curr != null){
        ListNode temp = curr.next;
        // reverse the pointer
        curr.next = prev;
        prev = curr;
        curr = temp;
       }
        return prev;
    }
}
