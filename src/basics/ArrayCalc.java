package basics;

public class ArrayCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] goop = {5,3,6,9,100,43};
		int i;
		double min;
		
		min = goop[0];
		
		for(i = 1; i < goop.length; i++) {
			if(goop[i] < min) {
				min = goop[i];
			}
		}
		System.out.println("The min is: "+min);
		System.out.println("This is the average: ");
		System.out.println("This is the max: ");
	}

}
