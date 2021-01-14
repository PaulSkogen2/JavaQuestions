
public class Tests {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		MakePalindrome mp = new MakePalindrome();
		MakeShortPalindrome msp = new MakeShortPalindrome();
		Calculator calc = new Calculator();
		
		System.out.println(rs.reverseString("gnitset"));
		System.out.println(mp.makePalindrome("level"));
		System.out.println(msp.makeShortPalindrome("level"));
//		System.out.println(msp.makeShortPalindrome("tree"));
		
		System.out.println(calc.add(12, 53));
		System.out.println(calc.subtract(87, 23));
		System.out.println(calc.multiply(5, 6));
		System.out.println(calc.divide(15 , 3));

	}

}
