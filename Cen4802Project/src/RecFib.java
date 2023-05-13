
public class RecFib {

	
	public static int nthOfFib(int n) {
		
		if (n <= 0) { 			// Catch 0's and negatives immediately
			throw new IllegalArgumentException("n must not be 0, and must be postiive.");
		}
		
		if (n == 1 || n == 2) { //  
			return 1;
		}
		
		return nthOfFib(n-1) + nthOfFib(n-2);
	}
	
	
	
	public static void main(String[] args) {
		
		int n = 10;
		int fibNum = nthOfFib(n);
		
		System.out.println("The " + n + "th Fibonacci number is: " + fibNum);
		
	}

}
