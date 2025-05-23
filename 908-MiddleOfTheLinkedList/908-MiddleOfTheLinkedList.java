// Last updated: 23/05/2025 18:46:54
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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int total = 0;

        while (current != null) {
            total++;
            current = current.next;
        }

        int middle = total / 2;
        System.out.println(middle);

        current = head;
        total = 0;

        while (current != null) {
            if (total == middle) {
                break;
            }
            total++;
            current = current.next;
        }

        return current;
    }
}