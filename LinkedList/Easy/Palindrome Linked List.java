// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> st = new Stack<>();
//         ListNode curr = head;
//         while(curr != null){
//             st.push(curr.val);
//             curr= curr.next;
//         }
//         curr = head;
//         while(curr != null){
//             if(curr.val != st.peek())
//             return false;
//             st.pop();
//             curr = curr.next;
//         }
//         return true;
//     }
// }

// this is the recursive way to do this

public class Solution {
    private ListNode curr;

    public boolean solve(ListNode head) {
        if (head == null)
            return true;

        // Recursive call to go to the end of the list
        if (!solve(head.next)) {
            return false;
        }

        // Compare values from start and end
        if (head.val != curr.val) {
            return false;
        }

        // Move curr to the next node
        curr = curr.next;
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        curr = head; // Initialize curr pointer
        return solve(head);
    }
}


// this is the proper way todo this question 

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=rev(slow);
        fast=head;
        while(slow!=null)
        {
            if(slow.val!=fast.val)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode rev(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}