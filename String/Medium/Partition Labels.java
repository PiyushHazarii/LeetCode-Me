class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // first of all we have put the character and the  
        // last index it appears
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c,i);
        }

        List<Integer> list = new ArrayList<>();
        int start =0;
        int goal =0;
        int countOfCharacter =0;

        while(start < s.length()){
            char c = s.charAt(start);
            goal = Math.max(goal, map.get(c));
            countOfCharacter++;
            if(start == goal){
                list.add(countOfCharacter);
                countOfCharacter=0;
            }
            start++;
        }
        return list;
    }
}