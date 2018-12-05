package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAcct la = new LoanAcct();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//poly cause it changes where we are pointing
		IRate account1 = new LoanAcct();
		account1.increaseRate();
		account1.setRate();
		
	}

}
