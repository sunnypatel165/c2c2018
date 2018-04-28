class StringMethods {
	public static void main(String[] args){
		
		// Strings can be initialized with literals
		String s1 = "I am the one who knocks! ";
		
		// They may also be instantiated using the constructor
		// THIS IS BAD, DON'T DO THIS
		String s2 = new String("I am the danger!");
		
		// Strings can be concatenated using the + operator
		String s3 = s1 + s2;
		
		// \n is a special character representing a new line
		System.out.println(s1 + "\n" + s2 + "\n" + s3);
		
		System.out.println();
		
		// length (unsurprisingly) returns the length of the string
		System.out.println("Length of string s1: " + s1.length());
		
		// charAt(int index) returns the character at the specified index
		System.out.println("character of s1 at index 5: " + s1.charAt(5));
		
		
		/* indexOf has several variations
			* indexOf(char c)
			* indexOf(int start, char c)
			* indexOf(String k)
			* indexOf(int start, String k)
		 */
		System.out.println("Index of o in s1: " + s1.indexOf('o'));
		System.out.println("Index of o in s1 after index 9: " + s1.indexOf('o', 10));
		System.out.println("Index of am in s3: " + s3.indexOf("am"));
		System.out.println("Index of am in s3 after index 4: " + s3.indexOf("am", 4));
		
		/* substring simply returns a string starting at the start index,
		 * and ending at the end index (exclusive)
		 * If the end index is not specified, it continues till the end of the string
			* substring(int start)
			* substring(int start, int end)
		 */
		
		System.out.println("s3 from 0 to 25: " + s3.substring(0, 25));
		System.out.println("s3 from 25 to end: " + s3.substring(25));
	}
}
