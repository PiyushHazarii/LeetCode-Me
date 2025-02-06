class Solution {
        public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a: nums)
            if (a > 0)
                set.add(a);
        return set.size();
    }
}


class Solution {
    public int minimumOperations(int[] nums) {
        int[] cnt = new int[101];
        for(int num : nums){
            cnt[num]++;
        }
        int size = 0;
        for(int i=1;i<101;i++){
            if(cnt[i] > 0) size++;
        }
        return size;
    }
}