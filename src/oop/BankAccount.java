package oop;

public class BankAccount implements IRate{
	
	String accountNumber;
	//static belongs to the CLASS not the object instance
	//final is a constant (often static final)
	
	private static String routingNum = "0123456";
	
	//Instance varibles
	String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		//1. They are used to define/ setup/ initialize props. of an obj
		//2. Con. are IMPLICITlY called upon instanciation 
		//3. the same name as the class itself
		//4. Con. have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading call same method name with diff. arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: "+ accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, msg, are all local varibles
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("Initial Deposit of:  $"+ initDeposit);
		String msg = null;
		
		if(initDeposit < 1000) {
			 msg = "ERROR";
			System.out.println(msg);
		}else {
			msg = ("Thanks for your deposit of: $"+initDeposit);
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	
	
	//Getters/Setters
	//Allow user to define the name
	public void setName(String name) {
		this.name = "Mr. "+ name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	
	
	
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit: ");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
	}
	
	private void showActivity(String activity) {
		System.out.println("Showing recent activity");
		System.out.println("Your new balance is: $"+balance);
	}
	
	
	void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "["+ name + "."+ accountNumber + ". Balance: $"+ balance +"]";
	}

}
