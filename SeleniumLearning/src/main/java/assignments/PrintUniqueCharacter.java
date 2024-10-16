package assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Karthik";
		char[] charArray = str.toCharArray();
		
		Set mySet = new HashSet();
		
		for (int i = 0; i < charArray.length; i++) {
			
			mySet.add(charArray[i]);	
			if(mySet.contains(charArray[i])) {
				mySet.remove(charArray[i]);
			}
			
		
			
			
		}
		System.out.println(mySet);

	}

}
