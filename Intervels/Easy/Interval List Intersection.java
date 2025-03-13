import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> intersectionIntervals(
        ArrayList<ArrayList<Integer>> interval1, 
        ArrayList<ArrayList<Integer>> interval2, 
        int n1, int n2
    ) {
        // Write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            int start1 = interval1.get(i).get(0);
            int end1 = interval1.get(i).get(1);
            int start2 = interval2.get(j).get(0);
            int end2 = interval2.get(j).get(1);

            // Find the intersection
            int intersectionStart = Math.max(start1, start2);
            int intersectionEnd = Math.min(end1, end2);

            // If valid intersection
            if (intersectionStart <= intersectionEnd) {
                result.add(new ArrayList<>(Arrays.asList(intersectionStart, intersectionEnd)));
            }

            // Move to the next interval in the list which ends first
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
