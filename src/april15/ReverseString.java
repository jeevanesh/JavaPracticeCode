package april15;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		int len = s.length(); //8
		
		String rev = "";
		
		//1. using for loop:
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		// 2. using Stringbuffer class:
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
