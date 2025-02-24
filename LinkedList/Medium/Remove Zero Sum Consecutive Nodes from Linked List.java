class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0,dummy);

        int prefixSum =0;
        while(head != null){
            prefixSum += head.val;
            if(map.containsKey(prefixSum)){
                ListNode start = map.get(prefixSum); // it will give the index of that element tha you 
                
                int psum = prefixSum;            // want to start our start and go to the head ;
                
                ListNode temp = start;          // here start is equal to p .
                while(temp != head){
                    temp = temp.next;
                    psum += temp.val;
                    if(temp != head)
                    map.remove(psum);
                }
                start.next = temp.next; // it will renove the connection between the 
                                        // nodes that gives us the negative value.

            }
            else{
                map.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}