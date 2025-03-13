import java.util.Stack;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		if(stack.isEmpty()){
			return;
		}
		int top = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack,top);
	}
	public static void insertAtBottom(Stack<Integer> stack, int element){
		if(stack.isEmpty()){
			stack.push(element);
			return;
		}
		int top = stack.pop();
		insertAtBottom(stack,element);
		stack.push(top);
	}

}
