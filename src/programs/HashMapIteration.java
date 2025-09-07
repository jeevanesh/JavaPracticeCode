package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(20, "Sagar");
		map.put(2, "Ketan");
		map.put(45, "Parag");
		
		System.out.println(map.size());
		System.out.println("----- While loop -----");
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key is: " + me.getKey() + "  Value is: " + me.getValue());
		}
		
		System.out.println("----- For loop -----");
		for(Map.Entry me2 : map.entrySet()) {
			System.out.println("Key is: " + me2.getKey() + "  Value is: " + me2.getValue());
		}
	}
}
