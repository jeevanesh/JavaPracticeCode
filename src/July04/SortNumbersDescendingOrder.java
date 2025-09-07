package July04;

public class SortNumbersDescendingOrder {
	public static void sortDescending(int[] arr) {
		// Use bubble sort for descending order
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Swap if current element is smaller than next element
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 6, 0, 8, 0, 1, 2, 0 };

		System.out.println("Original array:");
		
		printArray(numbers);
		sortDescending(numbers);

		System.out.println("Sorted array in descending order:");
		printArray(numbers);
	}

}
