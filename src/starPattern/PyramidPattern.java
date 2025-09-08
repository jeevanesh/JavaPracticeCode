package starPattern;

public class PyramidPattern {

	public static void main(String[] args) {
		
		/*
	*
   ***
  *****
 *******
*********
		 */
		
		// for loop for no. of rows
		// inner for loop -->  spaces
		// inner for loop --> star
		
		int rows = 5;
		
		// no. of rows
		for(int i=1; i<=rows; i++) {
			
			// inner loop to print spaces
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			
			// inner loop to print *
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
