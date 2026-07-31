// Last updated: 30/07/2026, 22:22:04
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0, dummy);
        int c = 0;

        while (head != null) {
            c += head.val;

            if (map.containsKey(c)) {
                ListNode node = map.get(c).next;
                int tempScore = c;
                while (node != head) {
                    tempScore += node.val;
                    map.remove(tempScore);
                    node = node.next;
                }
                map.get(c).next = head.next;

            } else {
                map.put(c, head);
            }

            head = head.next;
        }

        return dummy.next;
    }
}