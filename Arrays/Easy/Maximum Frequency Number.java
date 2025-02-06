import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int maxFrequencyNumber(int n, int[] arr) {
		// Write your code here
		Map<Integer, Integer> map = new HashMap();
		for(int i=0; i<n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int maxFrequency =0;
		int result =0;
		for(int num : arr){
			if(map.get(num) > maxFrequency){
				maxFrequency = map.get(num);
				result = num;
			}
		}
		return result;
	}
}