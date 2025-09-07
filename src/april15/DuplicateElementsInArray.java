package april15;

import java.util.Arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String names[] = { "Java", "Javascript", "Ruby", "Java", "Javascript" };
		System.out.println(Arrays.toString(names));
		int len = names.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("duplicate element is: " + names[i]);
				}
			}
		}

	}

}
