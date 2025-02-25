class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reverse1 = reverseList(l1);
        ListNode reverse2 = reverseList(l2);

        ListNode temp1 = reverse1;
        ListNode temp2 = reverse2;

        ListNode dummyNode = new ListNode();
        ListNode curr = dummyNode;
        int carry =0;
        while(temp1 != null || temp2 != null || carry > 0){
            int sum = 0;
            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if(temp2 != null){
                sum += temp2.val;
                temp2 = temp2.next;
            }

            sum += carry;

            carry = sum / 10;


            ListNode newNode = new ListNode(sum % 10);

            curr.next = newNode;
            curr = curr.next;
        }
        ListNode reverse = reverseList(dummyNode.next);
        return reverse;

        
    }
    public ListNode reverseList(ListNode l1){
        ListNode current = l1;
        ListNode prev = null;
        ListNode  nextCurrent = null;

        while(current != null){
            nextCurrent = current.next;
            current.next = prev;
            prev = current;
            current = nextCurrent;
        }
        return prev;
    }
}



// we can do this question without using reversing the linkedLIst;



// import java.util.Stack;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Stack<Integer> stack1 = new Stack<>();
//         Stack<Integer> stack2 = new Stack<>();

//         // Push all values from l1 to stack1
//         while (l1 != null) {
//             stack1.push(l1.val);
//             l1 = l1.next;
//         }

//         // Push all values from l2 to stack2
//         while (l2 != null) {
//             stack2.push(l2.val);
//             l2 = l2.next;
//         }

//         ListNode last = null; // This will be the head of the resulting list
//         int carry = 0;

//         // Process both stacks
//         while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
//             int sum = carry;

//             if (!stack1.isEmpty()) {
//                 sum += stack1.pop();
//             }

//             if (!stack2.isEmpty()) {
//                 sum += stack2.pop();
//             }

//             carry = sum / 10;
//             ListNode newNode = new ListNode(sum % 10);
//             newNode.next = last; // ye last se element daalega listNode mein.
//             last = newNode; // Update last.
//         }

//         return last;
//     }
// }

