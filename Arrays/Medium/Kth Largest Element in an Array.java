class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> b - a);


        for(int num:nums){
            pq.offer(num);
        }
        int cur = 0;
        for(int i = 0; i < k; i ++){
            cur = pq.poll();
        }
        return cur;
    }
}