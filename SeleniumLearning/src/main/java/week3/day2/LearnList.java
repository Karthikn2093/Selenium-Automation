package week3.day2;

import java.util.ArrayList;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To create List
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Name");
		arrayList.add(100);
		arrayList.add(true);
		
		System.out.println(arrayList);
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		stringList.add("Name");
		stringList.add(0, "List Value");
		
		
		System.out.println(stringList);
	}

}
