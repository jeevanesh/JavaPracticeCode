package programs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };
		int temp = 0;

//		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		//print sorted array
		System.out.println(Arrays.toString(arr));

//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i] + "");	
//		}

	}

}
