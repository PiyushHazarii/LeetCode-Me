
// this is not a efficient approach because it takes SC :- O(n) 

// class Solution {
//     public int findDuplicate(int[] nums) {

        // here hashMap is used 

        
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i : nums){
        //     if(map.get(i) > 1)
        //     return i;
        // }
        // return 0;


        // here hashset is used 


        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        // if (set.contains(num))
        //     return num;
        // set.add(num);
        // }
        // return -1; 
//     }
// }


// OPTIMAL approach


class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
    }
}


// this is the sorting approach 

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//             if(nums[i] == nums[i+1]) return nums[i];
//         return -1;
//     }
// }