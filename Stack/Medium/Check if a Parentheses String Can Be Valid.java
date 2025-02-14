// class Solution {
//     public boolean canBeValid(String s, String locked) {
//         int n = s.length();
//         if (n % 2 == 1) {
//             return false;
//         }

//         Stack<Integer> open = new Stack<>();
//         Stack<Integer> openclose = new Stack<>();

//         for(int i=0; i<n; i++){
//             if(locked.charAt(i) == '0'){
//                 openclose.push(i);
//             }else if(s.charAt(i) == '('){
//                 open.push(i);
//             }else if(s.charAt(i) == ')'){
//                 if(!open.isEmpty()){
//                     open.pop();
//                 }else if(!openclose.isEmpty()){
//                     openclose.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }

//         while(!open.isEmpty() && !openclose.isEmpty() && 
//                                  openclose.peek() > open.peek()){
//             open.pop();
//             openclose.pop();
//         }
//         return open.isEmpty();
//     }
// }

// intuition ye hai ki hum usko change nhi kr skte jisme 1 hai
// balki hum usko change kr skte hai jisme one nhi hai to

// to hum stack mein index daalna chalu kiye then agar locked mein
// 0 hai to usko daal dete hai openclose mein
// agar  s mein ( hai to isko daal denge open mein
// agar s mein ) mila to check akrenge agar open mein 
// element hai to usse pop karenge 
// nhi openclose se pop karenge nhi to else mein return false kr denge

// last mein jab tak openclose ka index bada rahega aur dono mein 
// element rahega to pop karenge dono mein


class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) 
            return false;
        int balance =0;

        for(int i=0; i<locked.length(); i++){
            if(locked.charAt(i) == '0' || s.charAt(i) == '(')
                balance++;
            else
                balance--;
            if(balance < 0)
                return false;
        }
        balance=0;
        for(int i=locked.length()-1; i>=0; i--){
            if(locked.charAt(i) == '0' || s.charAt(i) == ')')
                balance++;
            else
                balance--;
            if(balance < 0)
                return false;
        }
        return true;
    }
}