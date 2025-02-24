class Solution {
    public ListNode mergeTwoList(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null ) return l1;

        
        if(l1.val <= l2.val){
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }
    public ListNode partitionAndMerge(int start, int end, ListNode lists[]){
        // it means there is only one element 
        if(start == end) return lists[start];
        if(start > end ) return null; // start never ever be 
                                      // greater than end

        int mid = start + (end - start)/2;

        ListNode l1 = partitionAndMerge(start,mid,lists);
        ListNode l2 = partitionAndMerge(mid+1,end,lists);

        return mergeTwoList(l1,l2);
    }
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists == null || lists.length == 0) return null;
            return partitionAndMerge(0, lists.length -1,lists);
    }
}