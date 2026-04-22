// Last updated: 22/04/2026, 12:04:49
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode();
14        ListNode prev = dummy;
15        while (list1 != null && list2 != null) {
16            if (list1.val <= list2.val) {
17                prev.next = list1;
18                prev = list1;
19                list1 = list1.next;
20            } else {
21                prev.next = list2;
22                prev = list2;
23                list2 = list2.next;
24            }
25        }
26
27        if (list1 != null) {
28            prev.next = list1;
29        } else if (list2 != null) {
30            prev.next = list2;
31        }
32
33        return dummy.next;
34    }
35}