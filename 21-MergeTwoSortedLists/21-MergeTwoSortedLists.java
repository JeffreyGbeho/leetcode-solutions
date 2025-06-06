// Last updated: 23/05/2025 21:26:17
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){return null;}
        if(list1 == null && list2 != null){return list2;}
        if(list1 != null && list2 == null){return list1;}
        ListNode i = list1,j=list2;
        ListNode head = null,tail=null;
        while((i!=null) && (j!=null)){
            if(i.val<=j.val){
                if(head == null){
                    head = i;
                    tail = i;
                    i  = i.next;
                }else{
                    tail.next = i;
                    tail = tail.next;
                    i = i.next;
                }
            }else{
                if(head == null){
                    head = j;
                    tail = j;
                    j  = j.next;
                }else{
                    tail.next = j;
                    tail = tail.next;
                    j = j.next;
                }
            }
        }
        while(i!=null){
            tail.next=i;
            tail = tail.next;
            i = i.next;
        }
        while(j!=null){
            tail.next=j;
            tail = tail.next;
            j = j.next;
        }
        return head;
    }
}