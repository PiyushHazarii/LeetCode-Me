// class Solution {
//     public String reverseWords(String s) {
//         // Trim the input string to remove leading and trailing spaces
//         String[] str = s.trim().split("\\s+");

//         // Initialize the output string
//         String out = "";

//         // Iterate through the words in reverse order
//         for (int i = str.length - 1; i > 0; i--) {
//             // Append the current word and a space to the output
//             out += str[i] + " ";
//         }

//         // Append the first word to the output (without trailing space)
//         return out + str[0];
//     }
// }

class Solution {

    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
           

            sb.append(parts[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();

    }
}

// there is no differece in time complexity so we can do the upper one


// class Solution {
//     public String reverseWords(String s) {
//         // Convert the string to a mutable character array (StringBuilder)
//         StringBuilder sb = new StringBuilder(s);
//         int n = sb.length();

//         // Step 1: Reverse the entire string
//         reverse(sb, 0, n - 1);

//         int i = 0, l = 0, r = 0;

//         // Step 2: Reverse each word
//         while (i < n) {
//             // Move through the characters until a space is found
//             while (i < n && sb.charAt(i) != ' ') {
//                 sb.setCharAt(r++, sb.charAt(i++));
//             }

//             if (l < r) {
//                 // Reverse the word between indices l and r-1
//                 reverse(sb, l, r - 1);

//                 // Add a space after the word
//                 if (r < n) {
//                     sb.setCharAt(r++, ' ');
//                 }

//                 // Update the left pointer to the next word
//                 l = r;
//             }
//             i++;
//         }

//         // Step 3: Trim the trailing space if any
//         sb.setLength(r > 0 && sb.charAt(r - 1) == ' ' ? r - 1 : r);

//         // Convert back to a string and return
//         return sb.toString();
//     }

//     // Helper function to reverse a part of the StringBuilder
//     private void reverse(StringBuilder sb, int start, int end) {
//         while (start < end) {
//             char temp = sb.charAt(start);
//             sb.setCharAt(start, sb.charAt(end));
//             sb.setCharAt(end, temp);
//             start++;
//             end--;
//         }
//     }
// }
