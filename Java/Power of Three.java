public class Solution {
	public boolean isPowerOfThree(int n) {
		// version 1.0
//		double x = Math.log(n) / Math.log(3);
//		return Math.abs(x - Math.round(x)) < Math.pow(10, -12);
		
		// version 1.1
		double x = Math.log10(n) / Math.log10(3);
		return x - Math.round(x) == 0;
	}
}