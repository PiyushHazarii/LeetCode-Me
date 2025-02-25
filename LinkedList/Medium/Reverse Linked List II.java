/// first iteration : 1 -> 3 -> 2 -> 4 -> 5
// second iteration : 1 -> 4 -> 3 -> 2 -> 5

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        prev = dummy;

        for(int i=1; i<left; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;

        for(int i=1; i<=right-left; i++){
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }
        return dummy.next;
    }
}