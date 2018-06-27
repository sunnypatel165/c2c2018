# Session 6

## Table of Contents
1. [Abstract Classes](#abstract-classes)
2. [Interfaces](#interfaces)
3. [Dynamic Method Dispatch](#dynamic-method-dispatch)
4. [Assignments](#assignments)
    1. [HackerRank](#hackerrank)
    2. [Miscellaneous](#miscellaneous)

### <a name="#abstract-classes"></a>Abstract Classes

Abstract classes are classes that are declared abstract, and may or may not have abstract methods.

Important points:   
1. Abstract classes cannot be instantiated, only subclassed.  
2. An abstract method is a method with the abstract modifier, and no implementation.  
3. If you extend an abstract class, but don't override ALL the abstract methods, then your class MUST be abstract as well.  

```java
abstract class BankAccount {
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void getBalance();

	// A default implementation since 4% is a standard interest rate
	double getInterestRate() {
		return 4.0;
	}
}

class UCUCUBankAccount extends BankAccount {
	private double balance;

	void deposit(double amount) {
		if (amount < 1000) {
			System.out.println("Cannot deposit less than 1000");
		}
		else {
			balance += amount;
		}
	}

	void withdraw(double amount) {
		// Ugh, 1% transaction charge
		balance = balance - amount - 0.01 * amount;
	}

	void getBalance() {
		return balance;
	}

	// Does not override getInterestRate, gives the usual interest rate of 4%
}

class LenaBankAccount extends BankAccount {
	private double balance;

	void deposit(double amount) {
		// More lenient :)
		if (amount < 200) {
			System.out.println("Cannot deposit less than 200");
		}
		else {
			balance += amount;
		}
	}

	void withdraw(double amount) {
		// No transaction charge :)
		balance = balance - amount;
	}

	void getBalance() {
		return balance;
	}

	// Override getInterestRate to get a better interest rate
	double getInterestRate() {
		return 6.0;
	}
}
```

An excellent resource is the [Oracle Javadoc for abstract classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

### <a name="#interfaces"></a>Interfaces

An interface establishes a contract between software developers developing two separate pieces of software. It allows a developer to use a library without worrying about the internal implementation.  

Important points:
1. All methods in an interface are _implicitly_ public and abstract.  
2. All variables in an interface are _implicitly_ public, static and final.
3. A class can implement one or more interfaces.  

```java
interface Shape {
	// This is effectively a constant
	// Since it is final and static
	int NO_OF_DIMENSIONS = 2;

	double getArea();
	double getPerimeter();
}

class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}

	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}

class Square implements Shape {
	private int length;

	public Square(int length) {
		this.length = length;
	}

	double getArea() {
		return length * length;
	}

	double getPerimeter() {
		return 4 * length;
	}
}

class VolumeCalculator {
	// This accepts a Shape s
	// And since every Shape subclass MUST override the getArea method
	// This can calculate the volume of any uniform solid, like a cylinder or cuboid
	// It doesn't care what the actual type of shape is, i.e.
	// It doesn't care whether it is given a circle or square or whatever else
	// As long as it implements the Shape interface
	public static double getVolume(Shape s, double h) {
		return s.getArea() * h;
	}

	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println(getVolume(c, 10));

		Square s = new Square(10);
		System.out.println(getVolume(s, 10));
	}
}
```

Again, an excellent resource is the [Oracle Javadoc for interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)

### <a name="#dynamic-method-dispatch"></a>Dynamic Method Dispatch

Dynamic Method Dispatch is a mechanism by which a call to an overridden method on a parent reference is resolved at runtime.

For instance, simplifying the above example, we have:

```java
class DmdExample {
	public static void main(String[] args) {
		Shape c = new Circle(10);
		System.out.println(c.getArea());

		Shape s = new Square(10);
		System.out.println(s.getArea());
	}
}
```

As you can see, the reference is of the parent `Shape`, and the instance is of the child `Circle` or `Square`. When the method `getArea` is called, the runtime checks for an overridden method in the **instance**.

This now clarifies the two types of polymorphism and their implementations in Java:  
1. Static Polymorphism = Overloading (Decided at **Compile time** )  
2. Dynamic Polymorphism = Overriding (Decided at **Runtime**)

### <a name="assignments"></a>Assignments

#### <a name="hackerrank"></a>HackerRank

1. https://www.hackerrank.com/challenges/game-of-stones-1  
2. https://www.hackerrank.com/challenges/equality-in-an-array   
3. https://www.hackerrank.com/challenges/picking-numbers  
4. https://www.hackerrank.com/challenges/beautiful-triplets  
5. https://www.hackerrank.com/challenges/missing-numbers  
6. https://www.hackerrank.com/challenges/sam-and-substrings  
7. https://www.hackerrank.com/challenges/the-birthday-bar  
8. https://www.hackerrank.com/challenges/electronics-shop  
