package p1;

public class TestAccount {

	public static void main(String[] args) {
		Account customer1=new Account() ;
		customer1.deposit(500);
		Account customer2=new Account();
	    customer2.deposit(100);
	    System.out.println("customer1 has balance before withdrawl");
	    System.out.println(customer1.getBalance());
	    System.out.println("customer2 has balance before withdrawl");
	    System.out.println(customer2.getBalance());

	    customer2.withdrawl(300);
	    System.out.println("customer2 has balance after withdrawl ");
	    System.out.println(customer2.getBalance());
		

	}

}
