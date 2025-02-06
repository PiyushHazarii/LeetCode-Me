class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxcandvalue = -1;
        for(int i=0;i<n; i++)
        {
            if(candies[i] > maxcandvalue)
            {
                maxcandvalue = candies[i];
            }
        }
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i = 0 ;i<n; i++)
        {
            if(candies[i]+extraCandies >= maxcandvalue)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}