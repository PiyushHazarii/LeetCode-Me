
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        while(head != null){
            if(!set.contains(head.val)){
               temp.next = head;
               temp = temp.next;
            }
            head = head.next;
        }
        temp.next = null; // beacuse when we reach in the last element the every linkes list has the last element pointing to the null that is why this step is impottant.
        return dummy.next;
    }
}