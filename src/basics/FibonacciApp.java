package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibo number is the sum of 2 prev numbs
		System.out.println(fib(3));
	}
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return ( (fib(n-1) + fib(n-2)) );
	}
}
