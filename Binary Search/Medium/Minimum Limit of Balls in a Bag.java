class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left =1;
        int right = 1000000000;
        while (left < right){
            int mid = left+(right-left)/2;
            int count =0;
            for(int i : nums){
                count += (i-1)/mid;
            }
            if(count <= maxOperations)
            right = mid;
            else 
            left = mid+1;
        }
        return left;
    }
}




class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1, r = 1000000000;
        while (l < r){
            int mid = (l + r) / 2;
            if (canDivide(mid, maxOperations, nums))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    private boolean canDivide(int mid, int maxOperations, int[] nums){
        for (int num : nums){
            // this is the main formula for this question 
            // main intuition.
            if ((maxOperations -= (num - 1) / mid) < 0)
                return false;
        } 
        return true;
    }
}