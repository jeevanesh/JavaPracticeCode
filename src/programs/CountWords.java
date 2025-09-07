package programs;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "This this is is done by Saket Saket";
		String[] words = str.split(" ");
//		for(String Words: split){
//			System.out.println(Words);
//		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i < words.length; i++) {
			if(map.containsKey(words[i])) {
				int count = map.get(words[i]);
//				System.out.println(count);
				map.put(words[i], count+1);
			}
			else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);

	}

}
