package interview;

public class PrintCommonNumberFromArray {

	public static void main(String[] args) {

		int arr1[] = { 5, 9, 1, 2, 11, 12 };

		int arr2[] = { 13, 8, 6, 1, 12, 2 };

		// print the common number from both array

		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("common number from both array = " + arr1[i]);
				}
			}
		}
		
		
//		List<WebElement> ls = new List<WebElement>();
		

	}

}


