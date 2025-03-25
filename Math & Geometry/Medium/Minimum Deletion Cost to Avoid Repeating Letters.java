import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumCost(int n, String s, int[] cost) {
		// Write your code here.
		int mincost = 0;

		for(int i=1; i<n; i++){
			if(s.charAt(i) == s.charAt(i-1)){
				mincost += Math.min(cost[i], cost[i-1]);

				cost[i]=Math.max(cost[i],cost[i-1]);
			}
		}
		return mincost;
	}
}