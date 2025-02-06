class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;//eg, for decimal no. 2=> 2 XOR 0 = 2 
        }            // in binary, 010 XOR 000 = 010
        return res;
    }
}