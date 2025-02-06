class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(t.length()>s.length())
        return "";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        int left =0;
        int right=0;
        int minWindowSize=Integer.MAX_VALUE;
        int requiredCount = t.length();
        int start_index=0;

        while(right < n)
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>0)
            requiredCount--;

            map.put(ch,map.getOrDefault(ch,0)-1);

            while(requiredCount ==0)
            {
                int currentWindowSize = right-left+1;
                if(minWindowSize > currentWindowSize)
                {
                    minWindowSize=currentWindowSize;
                    start_index=left;
                }
                char c = s.charAt(left);

                map.put(c,map.getOrDefault(c,0)+1);

                if(map.containsKey(c) && map.get(c)>0)
                requiredCount++;

                left++;
            }
            right++;
        }
        if(minWindowSize == Integer.MAX_VALUE)
        return "";
        
        return s.substring(start_index,start_index+minWindowSize);
    }
}