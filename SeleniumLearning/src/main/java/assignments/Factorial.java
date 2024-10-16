package assignments;

import java.util.Iterator;

public class Factorial {
	
	public void fact() {
		
		int i = 5;
		int temp = 1;
		for (int j = i; j >=1; j--) {
			temp = temp * j;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		Factorial fact1 = new Factorial();
		fact1.fact();
	}

}
