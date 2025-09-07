package demoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesAndSort {

	public static void main(String[] args) {
		
		// Remove the duplicates and arrange the values
		// [55,00,11,99,77,55,77]
		
		List<Integer> numbers = Arrays.asList(55,00,11,99,77,55,77);
		
		System.out.println(numbers);
		
		Set<Integer> uniqueNumbers = new HashSet<>(numbers);
		
		System.out.println(uniqueNumbers);
		
		List<Integer> sortedList = new ArrayList<>(uniqueNumbers);
		Collections.sort(sortedList);
		System.out.println("Sorted list without duplicates: " + sortedList);
		
	}

}
