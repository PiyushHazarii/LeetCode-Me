class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            // for(char ch : words[i].toCharArray())
            // {
            //     if(ch == x)
            //     {
            //         result.add(i);
            //         break;
            //     }
            // }

            if(words[i].indexOf(x) >= 0)
            {
                result.add(i);
            }
        }
        return result;
    }
}