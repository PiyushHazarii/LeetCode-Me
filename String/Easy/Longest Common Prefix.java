// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         int n = strs.length;
//         int index = 0;

//         // sort the array so that we can easily find the longest common
//         // prefix beacause if we sort the array then
//         // the first string and the last string comparison can give
//         // us the result because when we sort the string then the
//         // middle part is in between the first and last string
//         Arrays.sort(strs);

//         String str1 = strs[0];
//         String str2 = strs[n-1];
//         while(index < str2.length() && index < str1.length()){
//             if(str1.charAt(index) == str2.charAt(index)){
//                 index++;
//             }else{
//                 break;
//             }
//         }
//         return str1.substring(0,index);
//     }
// }




// see the dairy(A life alive Forever)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==0) return "";
        String prefix = strs[0];

        for(int i=1 ; i<n; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
