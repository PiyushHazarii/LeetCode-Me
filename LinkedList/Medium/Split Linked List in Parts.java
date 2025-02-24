class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length =0;
        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            length++;
        }

        // this is the size of each bucket
        int eachBucketSize = length/k;
        // ye extra nodes har baar shuru ke bucket me add honge question mein hai
        int extraNodes = length%k;

        curr = head;
        ListNode prev = null; 
        ListNode res[] = new ListNode[k];

        for(int i=0; i<k; i++){
            res[i] = curr;

            // this is the size of the current bucket
            int currentBucketSize = eachBucketSize + (extraNodes > 0 ? 1 : 0);
            for(int j=0; j<currentBucketSize; j++){
                prev = curr;
                if(curr != null){
                    curr = curr.next;
                }
            }

            // prev ko null kr uska next null ho aur connection tut jaye tabhi
            // alag se ek bucket ban mein nodes ja payega
            if(prev != null){
                prev.next = null;
            }
            if(extraNodes > 0) extraNodes--;
        }
        return res;
    }
}