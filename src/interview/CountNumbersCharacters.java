package interview;

public class CountNumbersCharacters {

	public static void main(String[] args) {
		// count the number of integers and characters 
		
		String s = "nAJh4837sj";
		
		int countNumbers = 0;
		int countCharacters = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				countNumbers++;
			} else if (Character.isLetter(c)) {
				countCharacters++;
			}
		}
		System.out.println("Count of Numbers: " + countNumbers);
		System.out.println("Count of Characters: " + countCharacters);
		

	}

}
