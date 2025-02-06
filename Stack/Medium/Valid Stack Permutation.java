import java.util.*;

public class Solution {
    public static boolean validStackPermutation(ArrayList<Integer> first, ArrayList<Integer> other){

        if(first.size() != other.size()) return false;
        
        Stack<Integer> stack = new Stack<>();
        int j=0;

        for(int i=0; i<first.size(); i++){
            stack.push(first.get(i));

            while(!stack.isEmpty() && stack.peek().equals(other.get(j))){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}