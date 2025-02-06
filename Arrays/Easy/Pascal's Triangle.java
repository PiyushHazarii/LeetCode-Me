class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(ncr(i,j));
            }
            ans.add(list);
        }
        return ans;    
        
    }
    public static int ncr(int n, int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}



// this is the optimal approach 


    //     List<List<Integer>> res = new ArrayList<>();
    //     // we have to run this to = to numRows because 
    //     // there is same elements present as numRows present  
    //     for(int i=1;i<=numRows;i++){
    //         res.add(generateROW(i));
    //     }
    //     return res;
    // }
    // public static List<Integer> generateROW(int n){
    //     List<Integer> list = new ArrayList<>();
    //     int res = 1;
    //     list.add(res);
    //     for(int i=1;i<n;i++){
    //         res = res * (n-i);
    //         res = res/i;
    //         list.add(res);
    //     }
    //     return list;