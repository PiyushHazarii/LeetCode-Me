class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int mul = nums[i] * nums[j];
                map.put(mul, map.getOrDefault(mul,0)+1);
            }
        }
        int res =0;
        for(int i:map.values()){
            if(i >1){
                res += i *(i-1)*4;;
            }
        }
        return res;
    }
}