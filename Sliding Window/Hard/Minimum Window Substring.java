class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int left =0;
        int right = 0;
        int count = m;
        int minWindow = Integer.MAX_VALUE;
        int start_index = 0;

        while(right < n){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) > 0){
                count--;
            }
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)-1);
            while(count == 0){
                int currentWindow = right - left +1;
                if(minWindow > currentWindow){
                    minWindow = currentWindow;
                    // this is the index where the substring will start 
                    start_index = left;
                }

                map.put(s.charAt(left), map.getOrDefault(s.charAt(left),0)+1);
                if(map.containsKey(s.charAt(left)) && map.get(s.charAt(left)) > 0){
                    count++;
                }
                left++;
            }
            right++;
        }

        if(minWindow == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start_index, start_index + minWindow);
    }
}