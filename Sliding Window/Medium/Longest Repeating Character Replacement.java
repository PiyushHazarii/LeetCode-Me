class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int max  =0;
        int left =0;
        int ans  =0;
        for(int right =0; right<s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            
            max = Math.max(max, map.get(s.charAt(right)));
            while(right - left + 1 - max > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}

// //  eg input 2
// AABABBA k =1 
// left =0
// rigght = 0 
// max = 1

// right - left + 1 - max > k (0 < k) nahi hoga 
// ans = 1

// right = 1
// left =0
// max= 2
// right - left + 1 - max > k ( 0 < k) nahi hoga 
// ans = 2


// right = 3
// left =0
// max= 4
// right - left + 1 - max > k ( 0 < k) nahi hoga 
// ans = 4



// Another approach 2 


class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left =0;  int ans =0; int max=0;
        int arr[] = new int[26];
        for(int right=0;right<n;right++){
            arr[s.charAt(right)-'A']++;
            max = Math.max(max,arr[s.charAt(right)-'A']);
            if(right - left + 1 - max > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right - left +1);
        }
        return ans;
    }
}