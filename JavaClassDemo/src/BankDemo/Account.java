package BankDemo;

public class Account { 
	// Create a variable balance which will take decimal , cent
	// private is used so that any other class can not modify balance
	
	private double balance;

	// Set balance to 0.0
	
	// Account is constructor 
	public Account () {
		balance = 0.0;
	}
	
	public double getBalance () {
		return balance;
	}
	
	//  Deposit is Method which executes some Task 
	//  void is used not to return any value
	public  void deposit (double amount) {
		balance = balance + amount;
	}
	
	
	// Withdrawal is method 
	
	public void withdrawal (double amount) {
		if ( balance >= amount) {
		balance = balance - amount;
		System.out.println(" cust2 has balance after withrawal "+ balance);
	    }
		else {
		System.err.println(" Transaction cancelled Insufficient funds");
		}
	   
	}
	
	//Get balance to know the balance after deposit or withdrawal
	
	//getBalance method to return balance
	
	//public double getBalance () {
	//	return balance;
	//}

}
