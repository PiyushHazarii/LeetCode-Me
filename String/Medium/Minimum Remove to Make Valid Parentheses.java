class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int openCount = 0;
        
        // iterate from left to right and count the extra open bracket and 
        // skip the extra close bracket
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) continue; // Skip invalid closing ')'
                openCount--;
            }
            sb.append(c);
        }
        
        // iterate from right to left in sb to skip the extra open bracket
        StringBuilder result = new StringBuilder();
        int openToKeep = openCount; // Extra '(' to be removed
        
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && openToKeep > 0) {
                openToKeep--; // Skip this '('
                continue;
            }
            result.append(c);
        }
        
        // Reverse the result and return it
        return result.reverse().toString();
    }
}