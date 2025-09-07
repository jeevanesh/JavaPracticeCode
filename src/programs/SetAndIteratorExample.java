package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndIteratorExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Welcome");
		set.add("to");
		set.add("Java");
		set.add("Java");
		set.add("Welcome");
		
		System.out.println(set);
		
		Iterator<String> value = set.iterator();
		
		while(value.hasNext()) {
			Object obj = value.next();
			System.out.println(obj);
		}
		
		
		
	}

}
