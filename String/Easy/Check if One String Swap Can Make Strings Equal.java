class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       // If the strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        List<Integer> indexes = new ArrayList<>();
        
        // Find all positions where characters in s1 and s2 differ
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                indexes.add(i);
            }
            // If more than 2 differences, return false
            if (indexes.size() > 2) {
                return false;
            }
        }

        // If exactly 2 differences, check if swapping makes the strings equal
        return indexes.size() == 2 &&
               s1.charAt(indexes.get(0)) == s2.charAt(indexes.get(1)) &&
               s1.charAt(indexes.get(1)) == s2.charAt(indexes.get(0));
    }
}