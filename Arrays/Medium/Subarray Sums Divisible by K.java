// public class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int count = 0;
        
//         // Iterate through all possible subarrays
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];
//                 // Check if the sum is divisible by k
//                 if (sum % k == 0) {
//                     count++;
//                 }
//             }
//         }
        
//         return count;
//     }
// }


public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int count =0;
        int sum =0;
        int remainder =0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            remainder = sum % k;

            // agar remainder 0 se kam hota hai to
            // usko k se plus kr denge to wo positive remainder
            // ki tarah behave karege and all set
            if(remainder < 0){
                remainder += k;
            }

            if(map.containsKey(remainder)){
                count += map.get(remainder);
                // jaise hi subarray milega then uska frequency bhadhayenge
                // nahi to map mein sum and 1 put krte jayenge 
                map.put(remainder,map.getOrDefault(remainder,0)+1);
            }else
            map.put(remainder,1);
        }
        return count;
    }
}