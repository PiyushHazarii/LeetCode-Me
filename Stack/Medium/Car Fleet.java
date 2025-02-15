class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double pairs[][] = new double[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs,(a,b) -> Double.compare(b[0],a[0]));

        Stack<Double> stack = new Stack<>();
        for(int i=0; i<n; i++){
            // this is the formula to calculate the time taken by the car to reach the target
            // if the time taken by the car to reach the target is greater than the time taken by the car in front of it
            //then we have to push the time taken by the car to reach the target in the stack
            double time = (target - pairs[i][0]) / pairs[i][1];
            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}