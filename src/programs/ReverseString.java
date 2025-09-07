package programs;

public class ReverseString {

	public static String str = "WELCOME";

	public static void main(String[] args) {

		System.out.println("Reversed word = " + stringReverse()); // This method is used to reverse the string
		stringReverseUsingStringBuilder(); // This method is used to reverse the string using StringBuilder Class
		isPalindrome();
		stringReverseUsingStringBuffer();

	}

	public static String stringReverse() {
		String temp = "";
		char ch;

		System.out.println("Original word = " + str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			temp = ch + temp;
		}
		return temp;
	}

	public static void stringReverseUsingStringBuilder() {
		StringBuilder input1 = new StringBuilder();
		input1.append(str);
		input1.reverse();
		System.out.println("Reverse = " + input1);
	}

	public static void stringReverseUsingStringBuffer() {
		StringBuffer sb = new StringBuffer();
			sb.append(str);
		sb.reverse();
		System.out.println("Reverse String: " + sb);
				
	}

	public static void isPalindrome() {
		if (str.equals(stringReverse())) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is not Palindrome");
		}
	}
}
