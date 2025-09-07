package July04;

public class ReverseLastWord {

	public static void main(String[] args) {

		// "Java Automation Testing"
		// "Java Automation gnitseT"  --> expected output

		String str = "Java Automation Testing";

		String[] words = str.split(" ");
		String word = words[words.length - 1];
		System.out.println(word);
		int lenWord = word.length();

		String rev = "";
		for (int i = lenWord - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}

		System.out.println(rev);

		System.out.println("input string ==> " + str);
		System.out.println("Java Automation " + rev);

	}
}
