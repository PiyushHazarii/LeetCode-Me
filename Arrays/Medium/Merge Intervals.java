class Solution {
    public int[][] merge(int[][] intervals) {

        // this is the sorting techniques isse hum 2d array ko 
        // sort kr skte hai on the basis of a[0] and b[0];
        // means first element of each row

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> ans = new ArrayList<>();
        for(int []row : intervals){
            // pura row wise traverse krna hai aur first wale ka 
            // row[0] and last wale ka end agar row [0] chota hai to
            // merge hoga nhi to ans mein add hoga
            if(row[0] <= end){
                end = Math.max(end, row[1]);
            }else{
                ans.add(new int[]{start, end});
                start = row[0];
                end = row[1];
            }
        }

        // ye wala jab sab khatam ho jaye then last wala ko to 
        // add krna hoga na uske liye ye wala lagaye hai
        ans.add(new int[]{start, end});

        return ans.toArray(new int[0][0]);
    }
}