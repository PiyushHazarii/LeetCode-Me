class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int leftSmaller[] = new int[n];
        int rightSmaller[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
        if(stack.isEmpty())
            leftSmaller[i] = 0;
        else
            leftSmaller[i] = stack.peek() + 1;

            stack.push(i);
        }

        while(!stack.isEmpty())
            stack.pop();
        
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();

        if(stack.isEmpty())
            rightSmaller[i] = n-1;
        else
            rightSmaller[i] = stack.peek() - 1;

            stack.push(i);
        }
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(max, heights[i] * (rightSmaller[i] - leftSmaller[i] + 1));
        }
        return max;
    }
}