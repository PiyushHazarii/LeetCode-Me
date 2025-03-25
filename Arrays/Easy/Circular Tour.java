import java.util.* ;
import java.io.*; 
 
public class Solution {
	public static int firstCircularTour(int[] petrol, int[] distance, int n) {
		long totalpetrol =0;
		long totaldistance=0;
		long currentbalance=0;
		int start=0;

		for(int i=0; i<n; i++){
			totalpetrol += petrol[i];
			totaldistance += distance[i];
			currentbalance += petrol[i] - distance[i];

			if(currentbalance < 0){
				start = i+1;
				currentbalance =0;
			}
		}
		return (totalpetrol >= totaldistance)? start: -1;
	}

}
