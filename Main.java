package Lab2;

public class Main {

	public static void main(String[] args) {
	     BankAccount account1 = new BankAccount("muzerwa ntawukuriryayo", "30265", 500.0);
	     account1.printAccountDetails();

	     account1.deposit(200.0);
	     account1.printAccountDetails();

	     account1.withdraw(100.0);
	     account1.printAccountDetails();

	     account1.withdraw(700.0); 

	     for (int i = 1; i <= 3; i++) {
	         account1.deposit(50 * i); 
	         account1.withdraw(20 * i); 
	         account1.printAccountDetails();
	     }

	    
	     System.out.println("Final Balance: $" + account1.getBalance());

	    
	     while (account1.getBalance() < 1000) {
	         account1.deposit(50.0);
	     }
	     account1.printAccountDetails();

	   
	     do {
	         account1.withdraw(100.0);
	     } while (account1.getBalance() >= 500);
	     account1.printAccountDetails();

	    
	     System.out.println("Account Status via getter: " + account1.getAccountStatus());
	     account1.freezeAccount();
	     System.out.println("Account Status after freeze: " + account1.getAccountStatus());
	 }

	}
