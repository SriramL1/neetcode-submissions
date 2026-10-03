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
        // if list is empty return null
        if(head == null){
            return null;
        }
        // recursively call the function on head.next to reverese the rest of the list.
        ListNode nextHead = head;
        if(head.next != null){
            nextHead = reverseList(head.next);
            // next node points back to current node
            head.next.next = head;
        }
        head.next = null;
        return nextHead;
    }
}
