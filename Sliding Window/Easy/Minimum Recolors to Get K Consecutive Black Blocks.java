class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int left = 0, count = 0, res = Integer.MAX_VALUE;

        // Count the number of 'W' in the first window of size k
        for (int right = 0; right < k; right++) {
            if (blocks.charAt(right) == 'W') {
                count++;
            }
        }
        res = count; // Store the initial number of recolors needed

        // Slide the window across the string
        for (int right = k; right < n; right++) {
            if (blocks.charAt(right) == 'W') {
                count++;
            }
            if (blocks.charAt(left++) == 'W') {
                count--;
            }
            res = Math.min(res, count);
        }

        return res;
    }
}

// 2nd approach 

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int operation = 0;
        int minOperation = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
               operation++; 
            }
        }
        minOperation = operation;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') operation--;
            if (blocks.charAt(i) == 'W') operation++;

            minOperation = Math.min(minOperation, operation);
        }
        
        return minOperation;
    }
}