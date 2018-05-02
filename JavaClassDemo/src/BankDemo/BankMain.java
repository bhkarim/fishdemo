package BankDemo;

public class BankMain {

	public static void main(String[] args) {
	
		 // create cust1 object
		Account cust1 = new Account(); // Create a account object 
		cust1.deposit(600);
		
		 // create cust2 object
		 Account cust2 = new Account(); // Create an account object
         cust2.deposit(200);
		 
         // you can create multiple customer
         
         System.out.print(" cust1 has balance of before withdrawal ");
         System.out.println(cust1.getBalance());
         System.out.print(" cust2 has balance of before withdrawal ");
         System.out.println(cust2.getBalance());
         
         cust2.withdrawal(10);
      
       // System.out.println(" cust2 has balance after withrawal "+ cust2.getBalance());
         
	}

}
