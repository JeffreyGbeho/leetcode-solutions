// Last updated: 14/05/2026, 20:22:17
1class Solution {
2    public ListNode removeZeroSumSublists(ListNode head) {
3        ListNode dummy = new ListNode(0, head);
4        Map<Integer, ListNode> map = new HashMap<>();
5        map.put(0, dummy);
6        int c = 0;
7
8        while (head != null) {
9            c += head.val;
10
11            if (map.containsKey(c)) {
12                ListNode node = map.get(c).next;
13                int tempScore = c;
14                while (node != head) {
15                    tempScore += node.val;
16                    map.remove(tempScore);
17                    node = node.next;
18                }
19                map.get(c).next = head.next;
20
21            } else {
22                map.put(c, head);
23            }
24
25            head = head.next;
26        }
27
28        return dummy.next;
29    }
30}