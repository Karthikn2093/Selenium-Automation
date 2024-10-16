package assignments;

public class Armstrong {

	public static void main(String[] args) {
		
		int input = 153;
		int temp = input;
		int result = 0 ;
		int rem ; 
		
		while(temp > 0) {
			
			rem = temp % 10;
			//result = result + (rem * rem * rem);
			result = result + (int) Math.pow(rem, 3);
			temp = temp /10;
			
		}
		
		if(result == input ) {
			System.out.println(input +" is an Armstrong number");
		}else {
			System.out.println(input +" is not an Armstrong number");
		}
		
		int a = 5;
		int cube = (int) Math.pow(a, 3);
		System.out.println(cube);

	}

}
