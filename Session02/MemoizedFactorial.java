/*
 * Input:
 * First line is an integer T, the number of test cases, 1 <= T <= 10000
 * T lines follow, each an integer n, 1 <= n <= 10^6
 * 
 * Output:
 * Print out the factorial of each test case on a new line, modulo 10^9 + 7
 *
 * Intuition:
 * 	1. 21! will overflow long. This justifies the modulo calculation. 
 *	   Since factorial is repeated multiplication, you can apply modulo at each step safely.
 * 	2. Calculating (10^6)! will take (10^6) iterations of a loop. 
 *	   If all your 10k test cases are this number, you will end up with a LOT of recalculation
 *	   Thus, it would be better to use memoization.
 *	   You only need to calculate the factorial of the max, everything else gets stored on the way.
 */

import java.util.*;
 
class MemoizedFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10^9 + 7
		long mod = 1000_000_000 + 7;
		
		int T = sc.nextInt();
		
		int[] cases = new int[T];
		
		int maxCase = -1;
		
		for (int i = 0; i < T; i++) {
			cases[i] = sc.nextInt();
			maxCase = Math.max(cases[i], maxCase);
		}
		
		// We want to be able to access memoizedFactorials[maxCase]
		// And since arrays are 0 indexed, we need one extra slot
		long[] memoizedFactorials = new long[maxCase + 1];
		
		// Base case: 0! = 1
		memoizedFactorials[0] = 1;
		
		// Note an unrelated point
		// Variables declared and initialized inside the loop are tied to the scope of the loop
		// This is how you can declare "int i" twice.
		for (int i = 1; i <= maxCase; i++) {
			memoizedFactorials[i] = i * memoizedFactorials[i - 1];
			
			// We store it modulo, so that our next calculation doesn't overflow
			memoizedFactorials[i] = memoizedFactorials[i] % mod;
		}
		
		// A wonderful use case of the for-each
		for (int k : cases) {
			System.out.println(memoizedFactorials[k]);
		}
	}
}
