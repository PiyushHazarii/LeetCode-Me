import java.util.* ;
import java.io.*; 
/*

    intervals[i][0] = start point of i'th interval
    intervals[i][1] = finish point of i'th interval

*/
public class Solution {
	public static ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
	       if (intervals == null || intervals.isEmpty()) return new ArrayList<>();

        // Step 1: Sort intervals based on start time
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));

        ArrayList<ArrayList<Integer>> mergedIntervals = new ArrayList<>();
        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);

        // Step 2: Traverse the intervals and merge overlapping ones
        for (ArrayList<Integer> interval : intervals) {
            if (interval.get(0) <= end) {
                // Overlapping case: Extend the 'end' if needed
                end = Math.max(end, interval.get(1));
            } else {
                // No overlap: Save previous merged interval and update start & end
                mergedIntervals.add(new ArrayList<>(Arrays.asList(start, end)));
                start = interval.get(0);
                end = interval.get(1);
            }
        }
        
        // Step 3: Add the last merged interval
        mergedIntervals.add(new ArrayList<>(Arrays.asList(start, end)));

        return mergedIntervals;
	}
}
