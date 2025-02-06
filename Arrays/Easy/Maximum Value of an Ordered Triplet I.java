class Solution {
    public long maximumTripletValue(int[] nums) {
         long res = 0, maxa = 0, maxab = 0;
        for (int a : nums) {
            res = Math.max(res, 1L * maxab * a);
            maxab = Math.max(maxab, maxa - a);
            maxa = Math.max(maxa, a);
        }
        return res;
    }
}