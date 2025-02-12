class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int result =-1;
        for(int i=0; i<n; i++){
            int digitSum = digitsSum(nums[i]);

            if(map.containsKey(digitSum)){
                result = Math.max(result,nums[i]+map.get(digitSum));
            }

            //  76 notes dekho nhi samajh aa raha hai to
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), nums[i]));
        }
        return result;
    }
    public static int digitsSum(int num){
        int sum =0;
        while(num != 0){
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
}