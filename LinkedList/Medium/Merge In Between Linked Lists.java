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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // if(head == null || head.next == null)  return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = list1;
        ListNode temp1 = dummy;
        ListNode temp2 = dummy;

        for(int i=0; i<a; i++){
            temp1 = temp1.next;
        }

        for(int i=0; i<=b; i++){
            temp2 = temp2.next;
        }

        ListNode curr = list2;
        temp1.next = curr;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp2.next;

        return dummy.next;
    }
}