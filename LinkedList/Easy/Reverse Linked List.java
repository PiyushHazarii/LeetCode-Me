
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode last = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
}


        // ListNode current = head;
        // ListNode nextCurrent = null;
        // ListNode previous = null;

        // while(current != null){
        //     nextCurrent = current.next;
        //     current.next = previous;
        //     previous=current;
        //     current = nextCurrent;
        // }
        // return previous;
