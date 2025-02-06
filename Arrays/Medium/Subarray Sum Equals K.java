// this is the brute force method 

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i=0; i<nums.length;i++){
            int sum = 0;
            for(int j=i; j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}


// this is the optimal approach 

 

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();

        // sabse pehele 0 and 1 daal de rahe hai map mein kyuki 
        // agar shuru se i tak koi subarray aaye to wo le paye hum

        map.put(0, 1);
        // uske baad har baar check karenge sum - k present hai
        // ki nahi map mein agar present hai to count += karenge 
        // map.get(sum - k) karenge to usse le paye count mein

        // then agar present nhi hai to sum daalenge uske sath 
        // getOrDefault se uska value bhadayenge
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum -k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;  
    }
}