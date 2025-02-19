class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minIndex = -1;
        int maxIndex = -1;
        int dangerIndex = -1;

        long result = 0L;

        for(int i=0; i<nums.length; i++){
            // agar min se kam aur maxK se zyda aata hai to wo danger index mein aayega 
            // aur wo help karega humko sahi count dene mein 
            if(nums[i] < minK || nums[i] > maxK){
                dangerIndex = i;
            }
            // jab bhi agar min ke equal hoga ya to max ke equal hoga to i ke equal kr
            // denge usko as seen down
            if(nums[i] == minK){
                minIndex = i;
            }
            if(nums[i] == maxK){
                maxIndex = i;
            }
            // yaha pr min le rahe hai taaki taaki danger index se minus krke sahi 
            // answer mile 
            int min = Math.min(minIndex, maxIndex);
            result += Math.max(0L, min-dangerIndex);
        }
        return result;
    }
}