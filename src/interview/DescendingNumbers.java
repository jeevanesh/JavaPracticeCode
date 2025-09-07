package interview;

import java.util.*;

public class DescendingNumbers {

	public static void main(String[] args) {

		int a[] = { 0, 2, -5, 4, 7, 9, 9, 2, 55 };
		System.out.println("Original Array = " + Arrays.toString(a)); // print the array

		List<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length - 1; i++) { // outer loop
			for (int j = i + 1; j < a.length; j++) { // inner loop
				if (a[i] < a[j]) { // swap if the current element is less than the next element
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int num : a) { // add to the list
			al.add(num);
		}

		System.out.println("Array in descending order = " + al); // print the list
	}

}
