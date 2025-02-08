// this is the binary search approach how to find the square root of a number that is 
// closer or equal to the sqare root 
public class Solution
{
public static int squareRoot(int a)
    {
        // Write your code here.
        if(a==0 || a==1) return a;

        int left =0;
        int right = a;
        int ans =0;
        while(left <= right){
            int mid = left +(right - left)/2;
            // this is the method to find the root 
            if(mid <= a/mid){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}

