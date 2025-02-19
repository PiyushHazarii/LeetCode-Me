public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // thsi is the case in which if the first element
        // is the val then we have to remove it by doing head=head.next;
        while (head != null && head.val == val)
         head = head.next;

        ListNode curr = head;

        while (curr != null && curr.next != null){
            if (curr.next.val == val) 
            curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
}