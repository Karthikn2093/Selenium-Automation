package assignments;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp1 = 0;
		int temp2 = 1;
		System.out.print(temp1 +","+ temp2);
		for (int i = 0; i < 10; i++) {
			int temp3 = temp1 + temp2;
			System.out.print(","+temp3);
			temp1 = temp2;
			temp2 = temp3;
		}
		
	}

}
