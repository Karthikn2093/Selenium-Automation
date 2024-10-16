package assignments;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=10 ; i++) {
			
			if(i == 1) {
				System.out.println(i + " is neither Odd nor Even");
			}else if(i % 2 == 1 ) {
				System.out.println(i + " is an Odd Number");
			}
			
		}

	}

}
