package July04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class NumbersArray {

	public static void main(String[] args) {
		
		// find third largest number from Array
		
		int[] numbers = { 10, 55, 1, 5, 1, 10 };
		
		System.out.println(Arrays.toString(numbers));

		// Use TreeSet to store unique numbers in descending order
		TreeSet<Integer> uniqueSorted = new TreeSet<>(Collections.reverseOrder());
		for (int num : numbers) {
			uniqueSorted.add(num);
		}

		// Convert to List to access by index
		List<Integer> list = new ArrayList<>(uniqueSorted);

		if (list.size() >= 3) {
			System.out.println("3rd largest number: " + list.get(2));
		} else {
			System.out.println("Less than 3 unique numbers in the array.");
		}
	}

}
