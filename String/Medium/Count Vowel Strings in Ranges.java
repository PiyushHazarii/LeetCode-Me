// this is my approach to do this question totally my approach 
// BUT THIS IS TLE

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        
        int a =0;
        int ans[] = new int[queries.length];

        for(int row[] : queries){
            int count =0;

            int r = row[0];
            int c = row[1];

            for(int i=r; i<=c; i++){
                if(find(words[i])){
                    count++;
                }
            }
            ans[a++] = count;
        }
        return ans;
    }
    public static boolean find(String word){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(char c: word.toCharArray()){
            if(vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))){
                return true;
            }
        }
        return false;
    }
}

// this is the optimal approach 

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int prefix[] = new int[n];
        int ans[] = new int[queries.length];
        int count =0;

        for(int i=0; i<n; i++){
            if(find(words[i])){
                count++;
            }
            prefix[i] = count;
        }
        count=0;

        for(int row[]:queries){
            int r = row[0];
            int c = row[1];
            // agar r 0 se bada hoga to hi prefix[r-1] lenge nahi to 0 lenge 
            ans[count++] = prefix[c] - (r > 0 ? prefix[r - 1] : 0);
        }
        return ans;
    }
    public static boolean find(String word){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(char c: word.toCharArray()){
            if(vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))){
                return true;
            }
        }
        return false;
    }
}