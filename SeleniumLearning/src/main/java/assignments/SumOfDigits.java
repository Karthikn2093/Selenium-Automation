package assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int input = 123;
		
		int sum = 0;
		
		int rem;
		
		while(input > 0) {
			
			rem = input % 10; // Remainder is 3 at first, 2 at second, 1 at third
			System.out.println("Remainder: " + rem);
			sum = sum + rem; // sum = 0 + 3, sum = 3 + 2, sum = 5 + 1
			
			input = input / 10; // Quotient is 12 at first, 1 at second
			System.out.println("Quotient: " + input);
			
		}
		
		System.out.println("***********");
		System.out.println(sum);
		

	}

}
