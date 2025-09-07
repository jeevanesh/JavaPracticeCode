package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    // Main method to test the duplicate character function
    public static void main(String[] args) {
        // Call the function with a sample string "java"
        printDuplicateCharacters("anaya");
    }
    
    // Method to find and print duplicate characters in a string
    public static void printDuplicateCharacters(String str) {
        
        // Check if the input string is null
        if(str == null) {
            System.out.println("NULL String");
            return; // Exit the method if the string is null
        }
        
        // Check if the input string is empty
        if(str.isEmpty()) {
            System.out.println("Empty String");
            return; // Exit the method if the string is empty
        }
        
        // Check if the input string contains only one character
        if(str.length() == 1) {
            System.out.println("Single char string");
            return; // Exit the method if the string has a single character
        }
        
        // Convert the string to a character array to easily iterate over each character
        char words[] = str.toCharArray();
        
        // Create a HashMap to store each character and its frequency count
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        // Iterate over each character in the array
        for(Character ch : words) {
            // If the character is already in the map, increment its count by 1
            if(charMap.containsKey(ch)) { 
                charMap.put(ch, charMap.get(ch) + 1); 
            }
            // If the character is not in the map, add it with a count of 1
            else {
                charMap.put(ch, 1); 
            }
        }
        
        // Get the set of entries (character-frequency pairs) in the map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        
        // Iterate over the entry set to find characters with a frequency greater than 1
        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() > 1) { // Only print characters that appear more than once
                System.out.println(entry.getKey() +" : " + entry.getValue());
            }
        }
    }
}
