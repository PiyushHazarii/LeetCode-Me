class Solution {
    public int minimumLength(String s) {
        int ch[] = new int[26];
        for(char c : s.toCharArray()){
            ch[c-'a']++;
        }

        int totalElement = 0;
        for(int i : ch){
            if(i == 0) continue;
            else if(i%2 == 0) totalElement += 2;
            else totalElement += 1;
        }
        return totalElement;
    }
}
// intuiton
// aaa = a odd rahega to 1 add
// aaaa = aa even rahega to 2 add
// aaaaa = a
// aaaaaa = aa