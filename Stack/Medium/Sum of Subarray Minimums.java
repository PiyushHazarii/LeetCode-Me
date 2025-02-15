// class Solution {

//     //  IN this brute force it passes almost 90 percent test cases 
//     // but at last it time limit exceeded so we move to the better one.
//     public int sumSubarrayMins(int[] arr) {
//         final int M = 1000000007;
//         int n = arr.length;
//         int min =0;
//         int result =0;
//         for(int i=0; i<n; i++){
//             int minvalue = arr[i];
//             for(int j=i;j<n;j++){
//                 minvalue = Math.min(minvalue,arr[j]);
//                 result = (result + minvalue)%M;
//             }
//         }
//         return result;price
//     }
// }



class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int left[] = NSL(arr,n);
        int right[] = NSR(arr,n);

        long sum =0;
        final int M = 1000000007;

        for(int i=0; i<n; i++){
            long ls = i-left[i];
            long rs = right[i]-i;

            long minSubArray = ls*rs;
            long totalSubArray = arr[i] * minSubArray;  // kitni baar judega arr[i]

            sum = (sum+totalSubArray) % M;
    }
        return (int)sum;

    }
    public int []NSL(int arr[], int n){
        int left[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
            stack.pop();

            if(stack.isEmpty())
            left[i] = -1;
            else 
            left[i] = stack.peek();

            stack.push(i);
        }
        return left;
    }
    public int []NSR(int arr[], int n){
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            stack.pop();

            if(stack.isEmpty())
            right[i] = n;
            else 
            right[i] = stack.peek();
            
            stack.push(i);
        }
        return right;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)


