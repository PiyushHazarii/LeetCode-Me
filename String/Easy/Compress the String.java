import java.util.* ;
import java.io.*; 

public class Solution {
	public static String compressTheString(String s) {
		   StringBuilder compressed = new StringBuilder();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int count = 1; // Count occurrences of current character
            
            // Count consecutive occurrences
            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            
            // Append character
            compressed.append(s.charAt(i));
            
            // Append count only if it's greater than 1
            if (count > 1) {
                compressed.append(count);
            }
        }
        
        return compressed.toString();
	}

}

