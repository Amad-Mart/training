package oop;

public class bankAcc {

	public static void main(String[] args) {
		// gonna create a new bank account
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//With Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("51954118");
		System.out.println("Ssn: "+acc1.getSsn());
		
		acc1.accountNumber = "15616";		
		acc1.balance = 10000;
		acc1.increaseRate();
		acc1.setRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(2000);
		
		
		System.out.println(acc1.toString());
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "15616";
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "15616";
		acc3.checkBalance();

			
		System.out.println();
		
		//demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();*/
	}

}
