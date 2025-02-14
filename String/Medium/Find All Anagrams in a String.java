class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int pcount[] = new int[26];
        int scount[] = new int[26];

        for(int i=0; i<p.length(); i++){
            pcount[p.charAt(i) - 'a']++;
        }

        int left =0;
        int right = 0;
        int windowsize = p.length();

        while(right < s.length()){

            scount[s.charAt(right)-'a']++;

            if(right - left + 1 == windowsize){
                if(Arrays.equals(scount,pcount)){
                    list.add(left);
                }
                scount[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return list;
    }
}