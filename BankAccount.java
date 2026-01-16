package Lab2;

//BankAccount.java
public class BankAccount {

 // Instance variables
 private String accountHolder;
 private double balance;
 private String accountNumber;
 private double withdrawalLimit = 1000.0; // Withdrawal limit: no more than $1000 at a time
 protected String accountStatus = "Active"; // Protected variable for account status

 // Constructor to initialize account details
 public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
     this.accountHolder = accountHolder;
     this.accountNumber = accountNumber;
     this.balance = initialDeposit;
 }

 // Getter for accountHolder (Information Hiding)
 public String getAccountHolder() {
     return accountHolder;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Getter for accountStatus (to demonstrate access)
 public String getAccountStatus() {
     return accountStatus;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money (with limit and overdraft fee)
 public void withdraw(double amount) {
     if (amount > withdrawalLimit) {
         System.out.println("Withdrawal amount exceeds limit of $" + withdrawalLimit);
         return;
     }
     if (amount <= balance && amount > 0) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
     } else {
         System.out.println("Insufficient funds.");
     }
     // Check for overdraft and apply fee
     if (balance < 0) {
         balance -= 10.0; // Overdraft fee
         System.out.println("Overdraft fee charged: $10.0");
     }
 }

 // Method to print account information
 public void printAccountDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: $" + balance);
     System.out.println("Account Status: " + accountStatus);
 }

 // Method to freeze account
 public void freezeAccount() {
     accountStatus = "Frozen";
     System.out.println("Account has been frozen.");
 }
}