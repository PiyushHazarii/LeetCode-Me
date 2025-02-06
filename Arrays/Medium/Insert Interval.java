class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int n = intervals.length;
        int i =0;
        List<int[]> ans = new ArrayList<>();

        // this is for the row whose row[0][1] element is smaller than
        // the newInterval means it is in non overlapping state
        // so we can just add to the ans
        while(i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        // this is the case where we solve the overlapping problem 
        // means we can take the min of the intervals intervals[i][0]
        // and newIntervals[0] so that we can start from the minimum point 

        // and now we can take the max of the intervals[i][1] and 
        // newInterval[1] so that we can take the maximum from the 
        // overlapping indexes 
            while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
            i++;
        }
        ans.add(newInterval);


        // now at last when all the overlapping elment is added 
        // then just add tha last non overlapping part of the intervals
        while(i<n){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[0][0]);
    }
}