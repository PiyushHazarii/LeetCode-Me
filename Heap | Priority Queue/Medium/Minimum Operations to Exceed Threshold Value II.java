class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(
            
        );

        for(int i=0; i<nums.length; i++){
            pq.offer((long)nums[i]);
        }

        int count =0;

        while(!pq.isEmpty() && pq.peek() < k){
            long smallest1 = pq.poll();
            long smallest2 = pq.poll();

            long result = smallest1 * 2 + smallest2;
            pq.offer(result);
            count++;
        }
        return count;
    }
}