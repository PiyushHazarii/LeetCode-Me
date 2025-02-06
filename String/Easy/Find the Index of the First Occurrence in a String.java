class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // If needle is an empty string
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break; // Mismatch found, break inner loop
                }
                if (j == needle.length() - 1) {
                    return i; // Found needle in haystack
                }
            }
        }
        return -1; // Needle not found
    }
}


// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (haystack.length() < needle.length()) {
//             return -1;
//         }
        
//         for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//             if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                 return i;
//             }
//         }
        
//         return -1;        
//     }
// }