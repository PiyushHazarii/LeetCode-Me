//  BRUTE FOCE BY ME 

// class Solution {
//     public int pairSum(ListNode head) {
//         int arr[] = new int[100000];
//         int count=0;
//         int length =0;
//         while(head != null){
//             arr[count++] = head.val;
//             length++;
//             head = head.next;
//         }
//         int sum=0;
//         for(int i=0; i<length/2; i++){
//             sum = Math.max(sum, (arr[i]+arr[length-i-1]));
//         }  
//         return sum;      
//     }
// }


// public class Solution {
//     public int pairSum(ListNode head) {
//         Stack<Integer> stack = new Stack<>();
//         ListNode curr = head;
        
//         while (curr != null) {
//             stack.push(curr.val);
//             curr = curr.next;
//         }
        
//         curr = head;
//         int count = 1;
//         int N = stack.size();
//         int result = 0;
        
//         while (count <= N / 2) {
//             result = Math.max(result, curr.val + stack.pop());
//             curr = curr.next;
//             count++;
//         }
        
//         return result;
//     }
// }



// BEST APPROACH TO DO THIS QUESTION IS REVERSE THE HALF PART OF THE LINKED LIST 

public class Solution {
    public int pairSum(ListNode head) {
        ListNode mid = null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        
        // Reversing the second half of the linked list
        ListNode nextNode = null;
        ListNode prev = null;
        while (mid != null) {
            nextNode = mid.next;
            mid.next = prev;
            prev = mid;
            mid = nextNode;
        }
        
        // Calculate the maximum twin sum
        ListNode curr = head;
        int result = 0;
        while (prev != null) {
            result = Math.max(result, curr.val + prev.val);
            curr = curr.next;
            prev = prev.next;
        }
        
        return result;
    }
}