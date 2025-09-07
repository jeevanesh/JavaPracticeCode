package July10;

public class SeparateCharacters {

	public static void main(String[] args) {
		
		String Name = "FIRST12345second#$%";
		int len = Name.length();
		
		String uppercase="";
		String lowercase="";
		String digit="";
		String specialChars="";
		
		for(int i=0; i<len; i++) {
			char ch = Name.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				uppercase += ch;
			}
			else if(Character.isLowerCase(ch)) {
				lowercase += ch;
			}
			else if(Character.isDigit(ch)) {
				digit += ch;
			}
			else {
				specialChars += ch;
			}	
		}
		
		System.out.println("uppercase letters = " + uppercase);
		System.out.println("lowercase letters = " + lowercase);
		System.out.println("numerical digits = " + digit);
		System.out.println("special Characters = " + specialChars);
		
	}

}
