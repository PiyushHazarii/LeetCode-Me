// this is TWO SET approach 


// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         int n = A.length;

//         int count =0;
//         int ans[] = new int[n];
//         for(int i=0; i<n; i++){
//             if(!set1.contains(A[i])){
//                 set1.add(A[i]);
//                 if(set2.contains(A[i])){
//                     count++;
//                 }
//             }

//             if(!set2.contains(B[i])){
//                 set2.add(B[i]);
//                 if(set1.contains(B[i])){
//                     count++;
//                 }
//             }
//             ans[i] = count;
//         }
//         return ans;
//     }
// }



// this is the best approach by increasing the frequency

class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] stat = new int[a.length + 1];
        int[] c = new int[a.length];

        int cur = 0;
        for (int i = 0; i < a.length; i++) {
            stat[a[i]]++;
            if (stat[a[i]] == 2) {
                cur++;
            }
            stat[b[i]]++;
            if (stat[b[i]] == 2) {
                cur++;
            }
            c[i] = cur;
        }
        return c;
    }
}