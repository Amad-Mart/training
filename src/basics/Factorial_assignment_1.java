package basics;

public class Factorial_assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(5));
	}
	public static int fac(int n) {
		if((n==0) ||(n==1)) {
			return 1;
		}
		return ( n*fac(n-1));
	}
	
}
