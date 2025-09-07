package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		String [] names = {"Java", "C", "C++", "Java"};
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("dup ele: " + entry.getKey());
			}
		}
		
		
 		
	}

}
