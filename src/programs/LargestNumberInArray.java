package programs;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 9, 3};
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("largest number: " + arr[arr.length - 1]); // largest number
		System.out.println("second largest number: " + arr[arr.length - 2]);
	}

}
