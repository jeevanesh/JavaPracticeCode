package april15;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5};
		System.out.println("a[] = " + Arrays.toString(a));

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("missing number: " + (sum1 - sum));

	}

}
