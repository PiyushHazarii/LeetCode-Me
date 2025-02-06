class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int openCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) continue; // Skip invalid closing ')'
                openCount--;
            }
            sb.append(c);
        }
        
        // Second pass: Remove extra opening parentheses '(' from the end
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