package learing_new_features;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
	
	
	public static void initializeList() {
		List<Integer> listOfNums = new ArrayList<>();
		listOfNums.add(3);
		listOfNums.add(34);
		listOfNums.add(546);
		listOfNums.add(67);
		listOfNums.add(4567);
		
		System.out.println("List Of Numbers" + listOfNums);
		
		//List.copyOf() introduced in Java 10
		List<Integer> duplicateList = List.copyOf(listOfNums);
		System.out.println("Duplicate List : " + duplicateList);
//		It will throw an exception(UnsupportedOperationException) because it is an immutable list
//		duplicateList.add(4);
		
	}
	
	public static void main(String[] args) {
		initializeList();
	}
	
}
