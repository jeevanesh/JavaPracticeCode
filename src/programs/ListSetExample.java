package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetExample {

	public static void main(String[] args) {

		// List Example
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Rohan");
		nameList.add("Ajay");
		nameList.add("Rohan");  // duplicate allowed
		System.out.println("Name List: "+nameList);
		
		// Set Example
		Set<String> uniqueNamesSet = new HashSet<>();
		
		uniqueNamesSet.add("Ram");
		uniqueNamesSet.add("Seeta");
		uniqueNamesSet.add("Ram"); // Duplicate ignored
		uniqueNamesSet.add("SeetaS");
		uniqueNamesSet.add("Ajay");
		System.out.println("Set: "+uniqueNamesSet);
		
	}

}
