class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = Arrays.stream(piles).max().getAsInt();
         while(left < right){
            int mid = left+(right-left)/2;
            if(canEatAll(piles,mid,h))
            right = mid;

            else 
            left = mid+1;
         }
         return left;
    }
    public boolean canEatAll(int piles[], int mid, int givenHours){
        int actualHours =0;
        for(int i : piles){
            actualHours += i/mid;

            if(i % mid != 0)
            actualHours++;
        }
        return actualHours <= givenHours; 
        // this is done because the intuition says
        // when we add all the actaulHours with the 
        // reference to mid than it should be snaller than the givenHours  
    }
}