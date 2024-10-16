package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set mySet = new TreeSet();
		
		for (int i = 0; i < data.length; i++) {
			
			mySet.add(data[i]);
			
		}
		
		System.out.println(mySet);
		
		List list = new ArrayList(mySet);
		
		System.out.println(list.get(list.size()-2));

	}

}
