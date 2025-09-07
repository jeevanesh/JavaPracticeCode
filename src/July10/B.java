package July10;

class A {
	static void print() {
		System.out.println("print class A");
	}
}

public class B extends A {

	static void print() {
		System.out.println("print class B");
	}

	public static void main(String[] args) {
		print(); // Calls B's print method due to static binding

//		A a = new B();
//		a.print(); 
//		
//		B b = new B();
//		b.print(); 

	}

}
