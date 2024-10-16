package assignments;

import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < a.length; i++) {
			
			list1.add(a[i]);
		}
		
		for (int j = 0; j < b.length; j++) {
			
			list2.add(b[j]);
		}
		
		for (int i = 0; i < list1.size(); i++) {
			
			for (int j = 0; j < list2.size(); j++) {
				
				if(list1.get(i) == list2.get(j)) {
					
					System.out.println(list1.get(i));
				}
				
			}
			
			
			
		}

	}

}
