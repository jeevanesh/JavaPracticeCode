package interview;

public class SumOfNumbersFromString {

	public static void main(String[] args) {
		
		// This Java program extracts and sums all numeric digits from a given string. 
		
		String str = "A3B5C6D7E4V6";
		
		int sum = 0;
		
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		
		System.out.println("Sum of numbers in the string: " + sum);
	}

}
