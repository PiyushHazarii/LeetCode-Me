import java.util.*;
public class Solution 
{
    public static long countPositiveNegativePairs(int[] arr) 
	{
       Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
        
        for (int num : arr) {
            int opposite = -num;
            
            // If opposite exists in map, add its count to the result
            if (map.containsKey(opposite)) {
                count += map.get(opposite);
            }
            
            // Update the frequency of the current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}