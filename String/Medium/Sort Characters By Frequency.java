class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Convert keySet to a list and sort based on frequency
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a)); // Sort in descending order of frequency
        
        // Construct the result string
        StringBuilder result = new StringBuilder();
        for (char c : list) {
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}

