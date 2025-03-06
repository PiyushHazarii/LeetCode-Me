class Solution {
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		return i-1; // we return our current row minus one because the last row is our completed row
    }
}


class Solution {
    public int arrangeCoins(int n) {
      long low = 1, high = n;
      
      while(low <= high){
        long mid = low + (high-low)/2;
        // this is the main formula  
        long coins = (mid*(mid+1))/2;
        if(coins == n){
            return (int) mid;
        }else if(coins > n){
            high = mid-1;
        }else{
            low = mid+1;
        }
      }
      return (int) high ;
    }
    
}