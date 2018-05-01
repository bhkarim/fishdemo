package p1;

public class Account {
	 private double balance;
	public Account() {
		balance=0.0;
	} 
	public void deposit (double amount) {
		balance=balance+amount;
		
	}
	public void withdrawl (double amount) {
		if (balance>=amount) {
			balance=balance-amount;
			System.out.println("cust2 has balance after withdrawl" + balance);
		}
		else {
			System.err.println("Transaction cancelled insufficient funds");
		}
		//balance=balance-amount;
	
	}
	public double getBalance ( ) {
		return balance;
}
}
