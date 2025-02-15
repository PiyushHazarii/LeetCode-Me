import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] leastGreaterElement(int[] arr) {
        
        int result[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    min = Math.min(min, arr[j]);
                    result[i] = min;
                }
            }
            if(result[i] == 0){
                result[i] = -1;
            }
        }
        return result;
    }
}



import java.util.*;

public class Solution {
    public static int[] leastGreaterElement(int[] arr, int n) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        TreeSet<Integer> bst = new TreeSet<>();

        for (int i = n - 1; i >= 0; i--) {
            Integer greater = bst.higher(arr[i]);
            if (greater != null) {
                result.set(i, greater);
            }
            bst.add(arr[i]);
        }

        // return result.stream().mapToInt(i -> i).toArray();

        int ans[] = new int[arr.length];
        for(int i=0; i<bst.size();i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}
