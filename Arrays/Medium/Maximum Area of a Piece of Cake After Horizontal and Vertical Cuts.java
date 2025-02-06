class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // first we have to sort both the array horizontal and vertical 
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hhh = horizontalCuts.length;
        int www = verticalCuts.length;

        // then we have to find the maxHeight from horizontal cut and loop 
        // to find the maxheight 
        int maxHeight = Math.max(horizontalCuts[0]-0, h-horizontalCuts[hhh-1]);
        for(int i=1;i<hhh;i++){
            maxHeight = Math.max(maxHeight, horizontalCuts[i] - horizontalCuts[i-1]);
        }


        // then we have to find the maxWidth from verticalCuts and loop 
        // to find the maxWidth 

        int maxWidth = Math.max(verticalCuts[0]-0, w-verticalCuts[www-1]);
        for(int i=1;i<www;i++){
            maxWidth = Math.max(maxWidth, verticalCuts[i]-verticalCuts[i-1]);
        }

        // according to question we can do this 

        long area = 1L * maxHeight * maxWidth;
        
        return  (int) (area % 1000000007);
    }
}