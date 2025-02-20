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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        int sum =0;
        while(temp != null){
            sum += temp.val;
            if(temp.val == 0){
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                sum =0;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}