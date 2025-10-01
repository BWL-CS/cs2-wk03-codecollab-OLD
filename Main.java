public class Main {

    public static void main(String []args) {

		// *** USING OBJECT METHODS ***
        System.out.println("🏦 creating BankAccount objects 🏦"); 

		// HINT: check out the BankAccount.java file included in this project!
        BankAccount rich = new BankAccount(90.99);
		BankAccount broke = new BankAccount();
		BankAccount lizard = new BankAccount("Lord Zuck", 106100000000.00);

		double richBal = rich.getBalance();
        System.out.println("First account's balance: $" + richBal);

		// HINT: line 16 does the same thing as lines 12-13 in a different way...
        System.out.println("Second account's balance: $" + broke.getBalance());
		
		System.out.println("In need of a cash infusion? Here ya go! 💸");
        broke.deposit(100000);
        System.out.println("UPDATED second account's balance: $" + broke.getBalance());

		System.out.println("The third account in our system seems sus 🦎 checking it out...");
		System.out.println("Client's Name: " + lizard.getClientName());

		System.out.println("🔎 Investigating...");
		
		String realName = "Mark Zuckerburg";
		lizard.setClientName(realName);
		System.out.println("Client's REAL Name: " + lizard.getClientName());
		
        System.out.println("Time to redistribute some wealth #RobinHood");
		
        rich.withdraw(85000000000.00);
		System.out.println("We solved world hunger! How much does Zuck have left? ");
        System.out.println(lizard.getBalance());

		// *** MATH CLASS METHODS ***
      	System.out.println("\n--- MATH CLASS ---");

      	// HINT: try running the program multiple times...
      	double rand = Math.random();
      	System.out.println("Here's a random number: " + rand);
      	double biggerRand = Math.random() * 500;
     	System.out.println("Here's a bigger random number: " + biggerRand);
      	int randInt = (int) (Math.random() * 100 + 1);
      	System.out.println("Here's a random whole number: " + randInt);

      	double absoluteD = Math.abs(-3.14);
      	System.out.println("Absolute value of -3.14 is: " + absoluteD);
      	int absoluteI = Math.abs(-3);
      	System.out.println("Absolute value of -3 is: " + absoluteI);

        double cubed = Math.pow(randInt, 3);
        System.out.println(randInt + " to the 3rd power is: " + cubed);

        double squareRoot = Math.sqrt(2500);
        System.out.println("Square root of 2500 is: " + squareRoot);

   }
}
