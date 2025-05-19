class Solution {
    public String triangleType(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        if(nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]){
            return "none";
        }
           
             if(set.size() == 1){
                return "equilateral";
            }else if(set.size() == 2){
                return "isosceles";
            }
            return "scalene";
    }
}

// this takes less time and the code is also readable and good 
class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b <= c || a + c <= b || b + c <= a) return "none";
        if (a == b && b == c) return "equilateral";
        if (a == b || b == c || a == c) return "isosceles";
        return "scalene";
    }
}