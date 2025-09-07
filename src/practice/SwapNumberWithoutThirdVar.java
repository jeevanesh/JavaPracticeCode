package practice;

public class SwapNumberWithoutThirdVar {

	public static void main(String[] args) {
		
		// using third var:
		int x = 5;
		int y = 10;
		
//		int t;
//		
//		t=x; // 5
//		x=y; // 10
//		y=t; // 5
		
		// 1. without using third var: using + operator
		x = x+y; // 15
		y = x-y; // 5
		x = x-y; // 10
		
		// 2. without using third var: using * operator
//		x = x*y; // 50
//		y = x/y; // 5
//		x = x/y; // 10
		
		// 3. without using third var: using XOR ^
//		x = x ^ y;  // 15
//		y = x ^ y;  // 5
//		x = x ^ y;  // 10
		
		System.out.println("After swap x is: " + x);
		System.out.println("After swap y is: " + y);
		
		
	}

}
