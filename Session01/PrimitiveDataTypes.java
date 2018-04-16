/*
 * Small examples for understanding primitive data types
 */

class PrimitiveDataTypes {
	
	public static void main(String args[]) {		
		/* Overflow Example 
		 * Shows that a + 1 < a is possible
		 */
		System.out.println("\nOverflow example:");
		int a = Integer.MAX_VALUE;
		System.out.println("a = " + a);
		System.out.println("a + 1 = " + (a + 1));
		
		/* Type promotion example
		 * Smaller types can fit into larger ones 
		 * Hence no explicit "casting" is required
		 * By explicit, we mean that the user does not have to specify anything
		 * Hence 
		 * byte -> short -> int -> long -> float -> double
		 * char -> int -> long -> float -> double
		 * is implicitly (automatically) done
		 */
		 
		byte b = 32;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		// The following statements will not result in either compilation or run-time error
		s = b;	//byte to short
		i = s;	//short to int
		l = i;	//int to long
		f = l;	//long to float
		d = f;	//float to double
		
		/* However, assigning it in the opposite direction 
		 * e.g., a double into a byte
		 * causes "possible loss of precision"
		 */
		// If the following line is uncommented, the program will not compile
		// b = d; 
		
		// This compiles
		b = (byte)d;
		
		System.out.println("");
		
		System.out.println("Explicit Casting For Arithmetic On Smaller Data Type");
		
		// You can use _ to visually separate digits, BUT only in numeric literals
		// This is as good as int n = 1000000;
		int n = 1000_000;
		
		System.out.println("n = " + n);
		
		// The calculation n * n overflows before being assigned into wrongSquare
		long wrongSquare = n * n;
		System.out.println("WRONG: n * n = " + wrongSquare);
		
		// Instead, you need to do this:
		long correctSquare = (long)n * n;
		System.out.println("RIGHT: n * n = " + correctSquare);
		
		System.out.println("");
		System.out.println("Type Promotion For Arithmetic Operation on Different Data Types");
		// Another interesting feature is automatic widening in arithmetic calculations
		// If you perform arithmetic operations on two different datatypes
		// The smaller one will implicitly get promoted or widened into the larger one
		// This is exactly why line 65 results in the correct answer.
		
		int x = 1000_000;
		long y = 1000_000;
		
		// x got promoted to long!
		long correctSquareAgain = x * y;
		System.out.println("RIGHT: n * n = " + correctSquareAgain);
		
		// In case of more than two datatypes
		// The resulting datatype is the largest of them all
		
		int a1 = 1000;
		long a2 = 1000_0;
		double a3 = 1000_000.0;
		
		// The following lines will not compile
		// int intAnswer = a1 * a2 * a3;
		// long longAnswer = a1 * a2 * a3;
		
		double doubleAnswer = a1 * a2 * a3;
		System.out.println("a1 * a2 * a3 = " + doubleAnswer);
	}
}
