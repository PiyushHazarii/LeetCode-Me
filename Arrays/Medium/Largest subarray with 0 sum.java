------------------geeksforgeeks---------------


class Solution {
    int maxLen(int arr[]) {
        int max = 0;
        int n = arr.length;

        // this is the brute force approach


        // for(int i=0; i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum == 0){
        //             max = Math.max(max, j-i+1);
        //         }
        //     }
        // }
        // return max;


        // this is the optiaml approach


        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            }
            else if(map.containsKey(sum)){
                int j = i-map.get(sum);
                max = Math.max(max, j);
            }else{
                map.put(sum, i);
            }
        }
        return max;
    }
}
