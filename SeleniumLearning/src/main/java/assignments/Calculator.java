package assignments;

public class Calculator {
	
	public int add(int num1, int num2) {
		
		return num1 + num2 ; 
	}
	
	public double mul(double num1, double num2) {
		return num1 * num2 ;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(5, 5));
		System.out.println(calc.mul(2.5, 4.6));
		System.out.println(calc.sub(25, 16));
		

	}

}
