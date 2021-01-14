
public class MakePalindrome {
	
	public String makePalindrome(String str) {
		String suffix = "";
		
		for(int i = str.length()-2; i >= 0; i--) {
			suffix += str.charAt(i);
		}
		
		return str + suffix;
	}

}
