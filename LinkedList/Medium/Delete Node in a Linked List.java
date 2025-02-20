/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode previous = null;
        while(node != null && node.next != null){
            node.val = node.next.val;
            previous = node;
            node = node.next;
        }
        previous.next = null;
        // garbage collector node ko delete kr dega jo
        // unused hai matlab last wala
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public void deleteNode(ListNode node) {
//         System.out.println(node.val);
//         node.val=node.next.val;
//         node.next=node.next.next;
//     }
// }