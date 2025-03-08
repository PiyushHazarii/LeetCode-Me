import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int n = boards.size();
        int left = getMaxWeight(boards);
        int right = getSum(boards);
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int subArrayCount = find(boards, mid);
            
            if(subArrayCount > k){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int getSum(ArrayList<Integer> boards) {
        int sum = 0;
        for(int i : boards)
            sum += i;
        return sum;
    }

    public static int getMaxWeight(ArrayList<Integer> boards) {
        int max = boards.get(0);
        for (int num : boards) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int find(ArrayList<Integer> boards, int max) {
        int count = 1;
        int sum = 0;

        for(int i : boards) {
            if(i + sum <= max) {
                sum += i;
            } else {
                count++;
                sum = i;
            }
        }
        return count;
    }
}
