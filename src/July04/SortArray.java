package July04;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		// Write a program to sort the given array?
		String[] cars = { "Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi" };

		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars);
		
//		for (String car : cars) {
//			System.out.println(car);
//		}

		System.out.println(Arrays.toString(cars));

	}

}
