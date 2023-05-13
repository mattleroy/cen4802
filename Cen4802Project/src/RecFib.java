
public class RecFib {

	/**
	 * This function recursively returns the input of the users desired Fibonacci number to find.
	 * @author Matt LeRoy
	 * @param n the number given to the Fibonacci finder
	 * @return the desired Fibonacci number given as a param
	 */
	public static int nthOfFib(int n) {
		
		if (n <= 0) { 			// Catch 0's and negatives immediately
			throw new IllegalArgumentException("n must not be 0, and must be postiive.");
		}
		
		if (n == 1 || n == 2) { //  
			return 1;
		}
		
		return nthOfFib(n-1) + nthOfFib(n-2);
	}
	
	
	/**
	 * Entry point for nthOfFib() function.
	 * @author Matt LeRoy
	 * @param args CMD args, unused.
	 * @return Print to console of desired Fibonacci number.
	 */
	public static void main(String[] args) {
		
		int n = 10;
		int fibNum = nthOfFib(n);
		
		System.out.println("The " + n + "th Fibonacci number is: " + fibNum);
		
	}

}
