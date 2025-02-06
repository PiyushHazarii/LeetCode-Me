// class Solution {
//     public int addedInteger(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int result = nums2[0] - nums1[0];
//         return result;
//     }
// }


class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] < min1){
                min1 = nums1[i];
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] < min2){
                min2 = nums2[i];
            }
        }
        return min2 - min1;
    }
}


class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        for (int i=0; i<nums1.length;i++){
           sum1=sum1+nums1[i];
           sum2=sum2+nums2[i];
        }
        return ((sum2-sum1)/nums1.length);
    }
}