package TestDemo;

public class FinalizeMethodConcept {

	public static void main(String[] args) {

		// Finalize method is used to perform cleanup operations before an object is
		// garbage collected.
		// It is called by the garbage collector on an object when garbage collection
		// determines that there are no more references to the object.

		FinalizeMethodConcept obj = new FinalizeMethodConcept();
		System.out.println("Hashcode is : " + obj.hashCode());

		obj = null; // Making the object eligible for garbage collection

//		System.out.println("Hashcode is : " + obj.hashCode());
//		
		System.gc(); // Requesting garbage collection

		try {
			Thread.sleep(2000); // Giving time for garbage collection to occur
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of Garbage collection.");
	}

	// Defining the finalize method
	@Override
	protected void finalize() {
		System.out.println("Called the finalize() method");
	}

}
