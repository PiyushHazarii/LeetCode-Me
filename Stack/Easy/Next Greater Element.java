// CODING NINJA PROBLEM // 
public class Solution 
{
    public static ArrayList<Integer> nextGreaterElement (ArrayList<Integer> arr, int n)
    {
        // Write your code here.
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n,-1));

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr.get(st.peek()) < arr.get(i)){
                list.set(st.pop(), arr.get(i));
            }
            st.push(i);
        }
        return list;
    }
}