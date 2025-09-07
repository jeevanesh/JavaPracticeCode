package July10;

public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		String replaceText = "@40";
		StringBuilder sb = new StringBuilder(str);
		
		return sb.replace(0, sb.length(), sb.toString().replace(" ", replaceText));
	}

	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Coding Ninjas Is A Coding Platform");
		System.out.println(replaceSpaces(sb));
	}
}
