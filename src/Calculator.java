
public class Calculator {
	
	public int add(int...numbers) {
		int result = 0;
		
		for(int number : numbers) {
			result += number;
		}
		
		return result;	
	}
	
	public int subtract(int n1, int n2) {
		int result = 0;
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		
		for(int i = min; i < max; i++) {
			result++;
		}
		
		if(n1 < n2) {
			return -1 * result;
		} else {
			return result;
		}	
		
	}
	
	public int multiply(int n1, int n2) {
		int result = 0;
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		
		for(int i = min; i > 0; i--) {
			result += max;
		}
		
		return result;
	}
	
	public int divide(int n1, int n2) {
		int result = 0;
		int updated = n2;
		
		if(n2 == 0) {
			return -1;
		}
		while(updated <= n1) {
			result++;
			updated += n2;
		}
		
		return result;
	}
}
