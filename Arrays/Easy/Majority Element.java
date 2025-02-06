class Solution {
    public int majorityElement(int[] nums) {

        // this is the brute force approach O(n) extra space

        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        
        int result=0;
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+  1);

        n = n/2;
        for(int key:map.keySet())
            if(map.get(key) > n)
                return key;

        return 0;


        // Boyer-Moore Voting Algorithm

        // aur ek approach  is here bro
         int count = 0;
        int element = 0;

        
        for (int val : nums) {
            if (count == 0) {
                element = val;
            }
            if (element == val) {
                count++;
            } else {
                count--;
            }
        }
        
        return element;
    }
}

