class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[2];
        int count1=0;
        int count2 = 0;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(nums1[i] ==  nums2[j])
                {
                    count1++;
                    break;
                }
            }
        }
        arr[0] = count1;
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(nums2[i] ==  nums1[j])
                {
                    count2++;
                    break;
                }
            }
        }
        arr[1] = count2;
        return arr;
    }
}