package assignments;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set mySet = new TreeSet();
		
		for (int i = 0; i < data.length; i++) {
			
			if(mySet.contains(data[i])) {
				System.out.println(data[i]);
			}
			mySet.add(data[i]);
			
		}

	}

}
