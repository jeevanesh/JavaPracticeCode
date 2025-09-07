package interview;

public class FindDupChar {

	public static void main(String[] args) {

		String[] str = { "aad", "bas", "tam", "ccc", "bam", "jam dog" };

		for (String s : str) {
			if (findDupChar(s)) {
				System.out.println(s);
			}
		}
	}

	// Check if the string has all duplicate characters
	public static boolean findDupChar(String s) {
		for (int i = 1; i < s.length(); i++) {
			
			if (s.charAt(i) < s.charAt(i-1)) { // if the current char is less than the previous char
				return false;
			}
			
		}
		return true;
	}

}
