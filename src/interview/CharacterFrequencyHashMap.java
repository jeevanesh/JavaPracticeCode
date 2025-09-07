package interview;

import java.util.*;

public class CharacterFrequencyHashMap {

	public static void main(String[] args) {

		String str = "jeevanesh";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] c = str.toCharArray();
		System.out.println(Arrays.toString(c));

		for (char ch : str.toCharArray()) {
			Integer count = map.get(ch);  // get the current count of the character
			if (map.containsKey(ch)) {
				map.put(ch, ++count);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " > " + entry.getValue());
		}
	}
}
