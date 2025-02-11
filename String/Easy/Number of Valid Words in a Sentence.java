
class Solution {
    public int countValidWords(String sentence) {
        // we need only these threee things only then we can 
        // do it very easily 
        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String r2 = "[^0-9]+";
        String[] arr = sentence.split("\\s+");
        int ans = 0;
        for(String s: arr)
        {
            if(s.matches(regex) && s.matches(r2))
            {
                ans++;
            }
        }
        return ans;
    }
}