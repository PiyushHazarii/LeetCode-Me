class Solution {
    public String removeDuplicates(String s) {
        
        if (s == null || s.isEmpty()) {
            return s; // Handle empty or null strings gracefully
        }

        Stack<Character> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (st.isEmpty() || st.peek() != currentChar) {
                st.push(currentChar);
            } else {
                st.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString(); // Efficiently build result in reverse order
    }
}