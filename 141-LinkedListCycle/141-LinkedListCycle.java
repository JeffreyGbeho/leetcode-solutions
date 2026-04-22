// Last updated: 22/04/2026, 12:33:24
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow = head, fast = head;
15
16        while (slow != null && fast != null) {
17            if (fast.next == null || fast.next.next == null) {
18                return false;
19            }
20
21            slow = slow.next;
22            fast = fast.next.next;
23
24            if (slow == fast) {
25                return true;
26            }
27        }
28
29        return false;
30    }
31}