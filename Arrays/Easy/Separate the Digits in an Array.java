import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            List<Integer> temp = new ArrayList<>();
            while (i > 0) {
                temp.add(i % 10); // Extract the last digit
                i /= 10; // Remove the last digit
            }
            Collections.reverse(temp); // Reverse to maintain original order
            ans.addAll(temp);
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
