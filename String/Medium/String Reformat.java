// CODE 360
public class Solution {

	public static String stringReformat(String s, int k) {
		// Write your code here	 
		String ss = s.toUpperCase().replace("-","");
		StringBuilder sb = new StringBuilder();
		int length = ss.length();
		
		int firsCharacter=length%k;

		if(firsCharacter > 0){
			sb.append(ss.substring(0,firsCharacter));
		}

		for(int i=firsCharacter; i<length; i+=k){
			if(sb.length() > 0){
				sb.append("-");
			}
			sb.append(ss.substring(i,i+k));
		}
		return sb.toString();
	}

}
