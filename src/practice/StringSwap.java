package practice;

public class StringSwap {

	public static void main(String[] args) {
		
		// WAP to swap strings without using temp/third variable
		
		String a= "Hello";
		String b = "World";
		
		a = a+b; // HelloWorld
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
			
	}
}
