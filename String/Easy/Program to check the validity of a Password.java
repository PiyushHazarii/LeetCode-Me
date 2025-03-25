public class Solution {
	public static boolean isValid(String str) {
		 // Write your code here.
		 if(str.length() < 8 || str.length() > 15){
			 return false;
		 }
		 boolean hasUpper=false;
		 boolean hasLower=false;
		 boolean hasDigit=false;
		 boolean hasSpecial=false;

		 for(char ch: str.toCharArray()){
			 if(Character.isUpperCase(ch)){
				 hasUpper=true;
			 }else if(Character.isLowerCase(ch)){
				 hasLower=true;
			 }else if(Character.isDigit(ch)){
				 hasDigit=true;
			 }else if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
				 hasSpecial=true;
			 }else if(Character.isWhitespace(ch)){
				 return false;
			 }
		 }
		 return hasSpecial && hasDigit && hasLower && hasUpper;
	}
}

