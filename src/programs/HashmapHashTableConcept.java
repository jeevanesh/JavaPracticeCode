package programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashmapHashTableConcept {

	public static void main(String[] args) {
		
		/*
		 * Hashmap vs Hashtable 

			1. HashMap is non-synchronized. It is not thread-safe and can't be shared between many threads without proper synchronization code whereas 
			Hashtable is synchronized. It is thread-safe and can be shared with many threads.
			2. HashMap allows Null is allowed for both key and value. 
			Hashtable doesn't allow any null key or value.
			3. HashMap is generally preferred over HashTable if thread synchronization is not needed.
		 */

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(101, " ajay");
		ht.put(101, "Vijay");
		ht.put(102, "Ravi");
		ht.put(103, "Rahul");

		System.out.println("-------------Hash table--------------");
		for (Entry<Integer, String> m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// ----------------hashmap--------------------------------
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(104, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("-----------Hash map-----------");
//		for (Entry<Integer, String> m : hm.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}

	}

}
