// Last updated: 23/05/2025 19:36:18
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head; 
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        if (size == 1) {
            return null;
        }

        ListNode prev = null;
        curr = head;
        int i = 0;
        while (i < (size - n)) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        if (prev == null) {
            head = curr.next;
        } else {
            prev.next = curr.next;
        }

        return head;
    }
}