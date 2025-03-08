class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left =0;
        int right =0;
        int count =0;
        int temp[] = new int[m+n];
        while(left < n && right < m)
        {
            if(nums1[left] < nums2[right])
            {
                temp[count] = nums1[left];
                count++;  left++;
            }
            else
            {
                temp[count] = nums2[right];
                count++; right++;
            }
        }

        while(left < n)
        {
           temp[count] = nums1[left];
            count++; left++;
        }
        while(right < m)
        {
           temp[count] = nums2[right];
            count++; right++;
        }
        
        int size = m + n;

        if (size % 2 != 0)
            return temp[size / 2];

        return (temp[size / 2] + temp[(size / 2) - 1]) / 2.0;
    }
}

