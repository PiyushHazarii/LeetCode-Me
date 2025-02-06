class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for (String s : strs) {
            // convert all the elements of a string into int.
            // this is the best approach.
            ans = Math.max(ans, x(s));
        }
        return ans;
    }

    private int x(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                return s.length();
            }
        }
        // agar koi bhi character nhi rahega to integer mein
        // convert karke return kr denge
        return Integer.parseInt(s);
    }
}