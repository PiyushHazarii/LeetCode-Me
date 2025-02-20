// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         Stack<ListNode> stack = new Stack<>();
//         ListNode curr = head;
//         while(curr  != null){
//             stack.push(curr);
//             curr = curr.next;
//         }
        
//         curr = stack.pop();
//         // stack.pop();
//         int maxNode = curr.val;
//         ListNode resultNode = new ListNode(curr.val);

//         while(!stack.isEmpty()){
//             curr =stack.pop();
//             // stack.pop();
//             if(curr.val < maxNode)
//             continue;
//             else{
//                 ListNode newNode = new ListNode(curr.val);
//                 newNode.next = resultNode;
//                 resultNode = newNode;
//                 maxNode = curr.val;
//             }
//         }
//         return resultNode;
//     }
// }



// this is the recursive approach means recurssion is used here 


//  class Solution {
//     public ListNode removeNodes(ListNode head) {
//         if(head == null || head.next == null) return head;

//         ListNode reverseNode = removeNodes(head.next);

//         if(head.val < reverseNode.val){
//             head.next = null;
//             return reverseNode;
//         }


//         head.next = reverseNode;
//         return head;
//     }
// }


class Solution {
    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return last;
    }
    
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maximum = 0;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            maximum = Math.max(maximum, current.val);

            if (current.val < maximum) {
                prev.next = current.next;
                ListNode deleted = current;
                current = current.next;
                deleted.next = null;
            }

            else {
                prev = current;
                current = current.next;
            }
        }
        
        return reverseList(head);
    }
}