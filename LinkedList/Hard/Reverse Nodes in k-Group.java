class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return head;

        ListNode temp = head;
        int count = 0;

        // Check if there are at least k nodes left
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count < k) 
            return head; // If less than k nodes, return head without reversing

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }
}
