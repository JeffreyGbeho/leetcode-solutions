def merge(self, head1, head2):
    new = ListNode()  # Dummy node to act as the starting point of the merged list
    tmp = new         # Pointer to keep track of the current position in the merged list
    
    while head1 and head2:
        if head1.val < head2.val:
            tmp.next = head1  # Point tmp.next to head1
            tmp = tmp.next    # Move the pointer forward
            head1 = head1.next  # Move head1 to the next node
        else:
            tmp.next = head2  # Point tmp.next to head2
            tmp = tmp.next    # Move the pointer forward
            head2 = head2.next  # Move head2 to the next node
    
    # Attach any remaining nodes from head1 or head2
    if head1:
        tmp.next = head1
    if head2:
        tmp.next = head2
    
    return new.next  # Return the head of the merged list (skip the dummy node)
