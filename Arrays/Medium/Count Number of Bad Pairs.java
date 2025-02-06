// class Solution {
//     public long countBadPairs(int[] nums) {
//         // this is the brute force approach (TLE)
//         int  n = nums.length;
//         long count =0L;
//         // for(int i=0;i<n-1;i++){
//         //     for(int j=i+1;j<n;j++){
//         //         if((j - i) != (nums[j] - nums[i]))
//         //             count++;
//         //     }
//         // }

//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             int temp = i-nums[i];
//             if(map.containsKey(temp)){
//                 count += map.get(temp);
//                 map.put(temp, map.getOrDefault(temp,0)+1);
//             }else
//                 map.put(temp,1);
//         }        
//         return 1l * n*((n-1)/2) - count;


//     }
// }


class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;

        // j - i != nums[j] - nums[i] 
        // similarly nums[i] - i != nums[j] - j;
        Map<Integer,Integer> m = new HashMap<>();
        
        int diff = 0;
        long countgoodpair = 0;
        
        // in this we can find the good pairs

        for(int i=0;i<nums.length;i++){
            diff = nums[i] -i;
            
            if(m.containsKey(diff))
                countgoodpair += m.get(diff);
            
            m.put(diff,m.getOrDefault(diff,0) + 1);
            
        }
        
        // this is the formula for finding all pairs of nums
        long total = (n*(n-1)/2);
        // so we can subtract it from the total to find the bad pairs
        return total - countgoodpair;
        
    }
}
