
public class MakeShortPalindrome {
	ReverseString rs = new ReverseString();
	
	public String makeShortPalindrome(String str) {
		int half = str.length()/2;
		String suffix = "";
		
		for(int i = 0; i < str.length()-1; i++) {
			if(!(str.substring(0, i+1).equals(rs.reverseString(str.substring(str.length()-(i+1)))))) {
				suffix += str.charAt(i);
			} else {
				
			}
		}
		
		return str + rs.reverseString(suffix);	
		
	}

}
