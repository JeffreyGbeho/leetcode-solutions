# Last updated: 23/05/2025 19:54:02
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def merge(self, head1, head2):
        new = ListNode()
        tmp = new
        while head1 and head2:
            if head1.val < head2.val:
                tmp.next = head1
                tmp = tmp.next
                head1 = head1.next
            else:
                tmp.next = head2
                tmp = tmp.next
                head2 = head2.next
        
        if head1:
            tmp.next = head1
        if head2:
            tmp.next = head2
        
        return new.next
        

    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        
        def devide(l, r):
            if l == r:
                return lists[l]

            elif l < r:
                mid = l + (r - l) // 2
                left = devide(l, mid)
                right = devide(mid + 1, r)
                new = self.merge(left, right)
                return new 
            else:
                return None

        return devide(0, len(lists) - 1)  