/* The point of this program is to show
 * That even instances of a class are allowed to access the static variable
 * However, as the variable is associated with the class, and not with each object
 * All instances of that class reflect any changes made.
 */

class StaticExample {
    static int x = 7; 
	int y = 10;
}

class StaticVariableExampleRunner {
	public static void main(String args[]) {
		
		StaticExample a = new StaticExample();
		StaticExample b = new StaticExample();
		
		// The default value of x is displayed here
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		System.out.println("StaticExample.x = " + StaticExample.x);
		System.out.println();
		
		// Since a accesses and modifies the static variable
		// Anyone who now accesses x will show the new value
		System.out.println("Setting a.x = 1");
		a.x = 1;
		
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		System.out.println("StaticExample.x = " + StaticExample.x);
		System.out.println();
		
		// Similarly with b
		System.out.println("Setting b.x = 2");
		b.x = 2;
		
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		System.out.println("StaticExample.x = " + StaticExample.x);
		System.out.println();
		
		/* Even though instances can access static variables
		 * Non-static variables cannot be accessed by the class name
		
		 * The following line will throw an error if uncommented
		 * non-static variable y cannot be referenced from a static context
		 */
		// System.out.println(StaticExample.y);
	}
}
