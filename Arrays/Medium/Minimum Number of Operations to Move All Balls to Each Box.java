class Solution {
    public int[] minOperations(String boxes) {

        // this is the brute force method we have to improve this
        int n = boxes.length();
        char ch[] = boxes.toCharArray();
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(i!=j && ch[j] == '1'){
                    // if we find any one then we have to find the distance
                    // between there i and j (abstract)
                    count += Math.abs(i-j);
                    // i se j tak ka value ko le rahe hai and add kr rahe hai
                    // count mein taaki distance mil sake
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}

// // 110 hai to 
// // ans [] = { 1,1,3};

// // i != j hoga and ch == '1' to add karenge count mein 
// // abs value i-j ka and all set


class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];

        // Calculate moves from left to right
        int balls = 0, moves = 0;
        for (int i = 0; i < n; i++) {
            res[i] += balls + moves;
            moves += balls;
            balls += boxes.charAt(i) - '0';
        }

        // Calculate moves from right to left
        balls = 0; moves = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[i] += balls + moves;
            moves += balls;
            balls += boxes.charAt(i) - '0';
        }

        return res;
    }
}