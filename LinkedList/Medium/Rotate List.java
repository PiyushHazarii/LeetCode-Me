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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 )
        return head;
        ListNode curr = head;
        int length = 1;
        while(curr.next != null){ // curr,next bacause we have to fing the last node so that i will connect it to the head
            curr = curr.next;
            length++;
        }
        curr.next = head;

        k = k % length;  // this step will find node where we have to do node.next = null;
        ListNode temp = head;
        for(int i=1; i<(length - k); i++){
            temp = temp.next;
        }
        ListNode newNode = temp.next; // this will point to the head of the rotated linked list
        temp.next = null;
        return newNode;
        
    }
}