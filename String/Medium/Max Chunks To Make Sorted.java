class Solution {
    public int maxChunksToSorted(int[] arr) {
       int curMax = -1;
        int res = 0;

        // yaha par partition kitna karna hai wo batana hai 
        // the  prefix sum jaise karke banayenge 
        // jaise ki yaha pr hum max le rahe hai jab bhi currmax == i hoga 
        // tab hi aage bhadega res matlab increment hoga res kyuki 
        // humlog ko yaha pr diya hua hai ki 0 to n tak diya hua hai usme se partition 
        // nikalana hai humlog ko ki jab hum partition nikal le to wo sort ho jayega

        for (int i = 0; i < arr.length; i++) {
            curMax = Math.max(curMax, arr[i]); // Update the current maximum value
            if (curMax == i) { // If the maximum value matches the current index
                res++;
            }
        }

        return res; 
    }
}