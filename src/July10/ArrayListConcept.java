package July10;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList is a resizable array implementation of the List interface.
		// It can grow and shrink dynamically as elements are added or removed.
		// It allows duplicate elements and maintains insertion order.
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println("ArrayList: " + list);
		System.out.println("Size of ArrayList: " + list.size());
		
		list.remove("Banana");
		
		System.out.println("After removing Banana: " + list);
		
		System.out.println("Size of ArrayList: " + list.size());
		
		System.out.println("Element at index 0: " + list.get(0));
		
		list.clear();
		
		System.out.println("ArrayList after clearing: " + list);
	}

}
