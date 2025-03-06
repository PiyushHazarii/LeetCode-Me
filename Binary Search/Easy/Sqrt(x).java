class Solution {
    public int mySqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = low+(high-low)/2;;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }
}

// like how can we find the squate root of 8 so that
//  is why left = mid is there on the binary search
