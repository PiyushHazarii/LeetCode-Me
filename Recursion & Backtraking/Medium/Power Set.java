

//User function Template for Java

class Solution
{
    private List<String> result = new ArrayList<>();
    private void solve(StringBuilder curr, String s, int idx) {
        if (curr.length() > 0) {
            result.add(curr.toString());
        }

        for (int i = idx; i < s.length(); i++) {
            curr.append(s.charAt(i));
            solve(curr, s, i + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    
    public List<String> AllPossibleStrings(String s)
    {
        StringBuilder curr = new StringBuilder();

        solve(curr, s, 0);

        Collections.sort(result);

        return result;
    }
}