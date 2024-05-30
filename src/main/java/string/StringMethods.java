package string;

public class StringMethods {
public static void main(String[] args) {
	// Define a string
    String s = "Data Structures and Algorithms";

    // Print the original string
    System.out.println("Original string: " + s);

    // Length of the string
    int length = s.length();
    System.out.println("Length of the string: " + length);

    // Convert the string to lowercase
    String lowercase = s.toLowerCase();
    System.out.println("Lowercase string: " + lowercase);

    // Convert the string to uppercase
    String uppercase = s.toUpperCase();
    System.out.println("Uppercase string: " + uppercase);

    // Check if the string contains a substring
    String substring = "Structures";
    boolean containsSubstring = s.contains(substring);
    System.out.println("Does the string contain \"" + substring + "\"? :" + containsSubstring);

    // Extract a substring
    int startIndex = 5;
    int endIndex = 15;
    String extractedSubstring = s.substring(startIndex, endIndex);
    System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + extractedSubstring);

    // Replace characters in the string
    String replacedString = s.replace('a', 'X');
    System.out.println("String after replacing 'a' with 'X': " + replacedString);

    // Split the string into an array of substrings
    String[] words = s.split(" ");
    System.out.println("Split string into words:");
    for (String word : words) {
        System.out.println(word);
    }
}
}
