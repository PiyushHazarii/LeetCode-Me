
// Brute Force Method


// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         int arr[] = new int[n];
//         boolean found = true;
//         for(int i=0;i<n;i++){
//              found = false;
//             for(int j=0;j<m;j++){
//                 if(nums1[i]==nums2[j]){
//                     found = true;
//                 }
//                 if(found && nums2[j] > nums1[i]){
//                     arr[i] = nums2[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 arr[i] = -1;
//             }
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length)
        return new int[]{0};

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i : stack){
            map.put(i,-1);
        }
        int arr[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}