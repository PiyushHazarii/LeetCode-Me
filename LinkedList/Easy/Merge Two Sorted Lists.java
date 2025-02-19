// recursive way is the best way to solve this problem
// Time complexity: O(n+m) where n and m are the lengths of the two linked lists

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode result;

        if(list1.val < list2.val){
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        }
        else{
            result = list2;
            result.next = mergeTwoLists(list1,list2.next);
        }

        return result;
    }
}