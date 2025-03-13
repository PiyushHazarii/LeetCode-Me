import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solveHanoi(n, 1, 3, 2, result);
        return result;
    }

    private static void solveHanoi(int n, int source, int destination, int auxiliary, ArrayList<ArrayList<Integer>> result) {
        if (n == 0) return;
        
        // Move n-1 disks from source to auxiliary using destination as helper
        solveHanoi(n - 1, source, auxiliary, destination, result);
        
        // Move the nth disk from source to destination
        ArrayList<Integer> move = new ArrayList<>();
        move.add(source);
        move.add(destination);
        result.add(move);
        
        // Move the n-1 disks from auxiliary to destination using source as helper
        solveHanoi(n - 1, auxiliary, destination, source, result);
    }
}
