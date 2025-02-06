class Solution {
    private Map<String, Boolean> memo; // Equivalent to `unordered_map<string, bool> mp`
    private Set<String> wordSet; // Equivalent to `unordered_set<string> st`

    private boolean isConcat(String word) {
        // Check if the result for the word is already computed
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        int length = word.length();

        // Try splitting the word into prefix and suffix
        for (int i = 0; i < length; i++) {
            String prefix = word.substring(0, i + 1);
            String suffix = word.substring(i + 1);

            // Check if prefix is in the set and either:
            // 1. Suffix is also in the set
            // 2. Suffix can be formed using other words
            if (wordSet.contains(prefix) && 
               (wordSet.contains(suffix) || isConcat(suffix))) {
                memo.put(word, true);
                return true;
            }
        }

        // If no valid concatenation is found, mark the word as false
        memo.put(word, false);
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        memo = new HashMap<>();
        wordSet = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isConcat(word)) {
                result.add(word);
            }
        }

        return result;
    }
}
