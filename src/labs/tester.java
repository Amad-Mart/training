package labs;

public class tester {

		public static void main(String[] args) {
			tester acc1 = new tester("465329874", 1000);
			tester acc2 = new tester("651459198", 2000);
			tester acc3 = new tester("898411654", 2500);
			
			acc1.setName("Jim");
			System.out.println(acc1.getName());
			acc1.makeDeposit(500);
			acc1.makeDeposit(600);
			acc1.payBill(1000);
			acc1.accrue();
			System.out.println(acc1.toString());
		}
		
	}


	class tester {
		//props of ^
		private String accountNumber; //iD + Random 2 dig. num + first 2 of SSN
		private static final String routingNumber = "005400657";
		private String name;
		private String SSN;
		private double balance;
		private static int iD = 1000; //Internal iD, make it static cuz we want it to belong to class, not person
		
		//Constructor
		public tester(String SSN, double initDeposit) {
			balance = initDeposit;
			this.SSN = SSN; 
			iD++;
			setAccountNumber();
		}
		
		private void setAccountNumber() {
			int random = (int) (Math.random() *100);
			accountNumber = iD + "" + random+ SSN.substring(0,2);
			System.out.println("Your Account Number: "+accountNumber);
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		} 
		public void payBill(double amount) {
			balance = balance - amount;
			System.out.println("Paying bill: "+ amount);
			showBalance();
		}
		public void makeDeposit(double amount) {
			System.out.println("Making deposit: "+amount);
			balance = balance + amount;
			showBalance();
		}
		public void showBalance() {
			System.out.println("Balance: "+ balance);
		}
		public void accrue() {
			balance = balance * (1 + rate/100);
			showBalance();
		}
		@Override
		public String toString() {
			return "[Name: "+name+ " ]\n[Account Number: "+ accountNumber+ "]\n" + "[Rounting Number: "+routingNumber+"]\n"+"[Balance "+balance+"]\n" ;
		}
	}

