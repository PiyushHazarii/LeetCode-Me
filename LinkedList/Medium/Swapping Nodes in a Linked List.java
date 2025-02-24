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


// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         int length = findLength(head);


//         ListNode temp1 = head;
//         for(int i=1;i<k;i++){
//             temp1 = temp1.next;
//         }

//         ListNode temp2 = head;
//         for(int i=1; i<(length -k + 1);i++){
//             temp2 = temp2.next;
//         }

//         int temp = temp1.val;
//         temp1.val = temp2.val;
//         temp2.val = temp;

//         return head;
        
//     }
//     public int findLength(ListNode head){
//         int length =0;
//         while(head != null){
//             head = head.next;
//             length++;
//         }
//         return length;
//     }
// }






// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         int length = findLength(head);


//         ListNode temp1 = head;
//         ListNode temp2 = head;
//         for(int i=1; i<length; i++){
//              if(k > i){
//                 temp1 = temp1.next;
//              }
//              if((length - k +1) > i){
//                 temp2 = temp2.next;
//              }
//         }

//         int temp = temp1.val;
//         temp1.val = temp2.val;
//         temp2.val = temp;

//         return head;
        
//     }
//     public int findLength(ListNode head){
//         int length =0;
//         while(head != null){
//             head = head.next;
//             length++;
//         }
//         return length;
//     }
// }

