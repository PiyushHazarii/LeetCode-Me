class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int count =0;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String a = words[j];
                String b = new StringBuilder(a).reverse().toString();
                if(words[i].equals(b))
                {
                    count++;
                }

            }
        }
        return count;
    }
}