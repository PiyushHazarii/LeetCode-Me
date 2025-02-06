// class Solution {
//     public boolean canBeValid(String s, String locked) {
//         int n = s.length();
//         // because odd length  ko kabhi match nhi kr skte 
//         if(n%2 != 0) return false;

//         Stack<Integer> open = new Stack<>();
//         Stack<Integer> openClose = new Stack<>();

//         for(int i=0; i<n; i++){
//             if(locked.charAt(i) == '0'){
//                 openClose.push(i);
//             }else if(s.charAt(i) == '('){
//                 open.push(i);
//             }else if(s.charAt(i) == ')'){
//                 if(!open.isEmpty()){
//                     open.pop();
//                 }else if(!openClose.isEmpty()){
//                     openClose.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }

//         while(!open.isEmpty() && !openClose.isEmpty() && open.peek()
//          < openClose.peek()){
//             open.pop();
//             openClose.pop();
//          }

//          return open.isEmpty();
//     }
// }


class Solution {
    public boolean canBeValid(String inputString, String lockStatus) {
        if (inputString.length() % 2 != 0) 
            return false;

        int balanceCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (lockStatus.charAt(i) == '0' || inputString.charAt(i) == '(') 
                balanceCount++;
            else 
                balanceCount--;
            if (balanceCount < 0) 
                return false;
        }

        balanceCount = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (lockStatus.charAt(i) == '0' || inputString.charAt(i) == ')') 
                balanceCount++;
            else 
                balanceCount--;
            if (balanceCount < 0) 
                return false;
        }

        return true;
    }
}