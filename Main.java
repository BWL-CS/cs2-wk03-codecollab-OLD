public class Main {

	public static void main(String[] args) {

		// PART A: Calling static Methods
		System.out.println("\n--- STATIC METHODS ---");

		// BIG QUESTION: Where do these METHODS come from? (where are they DEFINED?)

		double accountBalance1 = 1500.00;
		greet();
		withdraw(accountBalance1);

		double accountBalance2 = 465.00;
		greet();
		withdraw(accountBalance2, 50.00);

		double accountBalance3 = 789.00;
		greet();
		double amountToWithdraw = 35.00;
		withdraw(accountBalance3, amountToWithdraw);

		// PART B: Using Math Methods
		System.out.println("\n--- MATH METHODS ---");

		// BIG QUESTION: Where do these METHODS come from? (where are they DEFINED?)

		double absoluteD = Math.abs(-3.14);
		System.out.println("Absolute value of -3.14 is: " + absoluteD);

		int absoluteI = Math.abs(-3);
		System.out.println("Absolute value of -3 is: " + absoluteI);

		double squareRoot = Math.sqrt(2500);
		System.out.println("Square root of 2500 is: " + squareRoot);

		// HINT: Try running the program multiple times to help explain this section...
		double rand = Math.random();
		System.out.println("Here's a random number: " + rand);

		double biggerRand = Math.random() * 500;
		System.out.println("Here's a bigger random number: " + biggerRand);

		int randInt = (int) (Math.random() * 100 + 1);
		System.out.println("Here's a random whole number: " + randInt);

		double cubed = Math.pow(randInt, 3);
		System.out.println(randInt + " to the 3rd power is: " + cubed);

	} // END of main method

	public static void greet() {
		System.out.println("🏧 Welcome to the ATM... please insert your card 💳");
	}

	public static void withdraw(double balance) {
		System.out.println("You took out $" + balance + " leaving you with a balance of $0.00");
	}

	public static void withdraw(double balance, double amount) {
		double newBalance = balance - amount;
		System.out.println("You took out $" + amount + " leaving you with a balance of $" + newBalance);
	}

} // END of class
