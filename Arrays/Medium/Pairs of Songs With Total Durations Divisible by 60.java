TLE 
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        // time limited exceeded solution is here
        int n = time.length;
        int count =0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //        if((time[i]+time[j]) % 60 == 0)
        //             count++;
        //     }
        // }
        // return count;

        // this is the optimal solution here
    }
}


// optimal is here 
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
       
        int n = time.length;
        int count =0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int t:time){
            if(t%60 == 0){
                // this is the case for (60 60 60 ) where how it runs
                // first 0-0 count=0, 0-1 count +=1 1, 0-2 count+=2 = 3
                count += map.getOrDefault(0,0);
            }else{
                count += map.getOrDefault(60-t%60,0); // this is the key 
            }
            map.put(t%60,map.getOrDefault(t%60,0)+1);
        }
        return count;
    }
}