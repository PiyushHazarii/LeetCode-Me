import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> prevSmall(ArrayList<Integer> arr, int n)
	{
		// Write Your Code Here.
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();

		for(int i=0; i<n; i++){
			while(!stack.isEmpty() && arr.get(stack.peek()) >= arr.get(i)){
				stack.pop();
			}
			if(stack.isEmpty()){
				ans.add(-1);
			}else{
				ans.add(arr.get(stack.peek()));
			}
			stack.push(i);
		}
		return ans;
	}
}