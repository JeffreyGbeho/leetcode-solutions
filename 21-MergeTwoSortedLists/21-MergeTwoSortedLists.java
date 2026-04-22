// Last updated: 22/04/2026, 12:02:07
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
14        ListNode prev = null;
15        while (list1 != null && list2 != null) {
16            if (list1.val <= list2.val) {
17                if (prev != null) {
18                    prev.next = list1;
19                }
20                prev = list1;
21                list1 = list1.next;
22            } else {
23                if (prev != null) {
24                    prev.next = list2;
25                }
26                prev = list2;
27                list2 = list2.next;
28            }
29
30            if (dummy.next == null) {
31                dummy.next = prev;
32            }
33        }
34
35        if (list1 != null) {
36            if (prev == null) {
37                dummy.next = list1;
38            } else {
39                prev.next = list1;
40            }
41        } else if (list2 != null) {
42            if (prev == null) {
43                dummy.next = list2;
44            } else {
45                prev.next = list2;
46            }
47        }
48
49        return dummy.next;
50    }
51}