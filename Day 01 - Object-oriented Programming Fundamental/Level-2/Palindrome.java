public class Palindrome {
    public static void main(String[] args) {
        // Create an object of class PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Set the word using the setter method
        checker.setWord("madam");

        // Display the result
        checker.displayResult();
    }
}

class PalindromeChecker {
    // Attribute for the word
    private String word;

    // Default constructor
    public PalindromeChecker() {
    }

    // Setter method to set the word
    public void setWord(String word) {
        this.word = word;
    }

    // Method to check if the word is a palindrome
    public boolean isPalindrome() {
        // Create variable to keep track of left and right index
        int left = 0;
        int right = word.length() - 1;
        // Compare characters from left and right index
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                // If characters do not match, return false
                return false;
            }
            // Move left and right index towards the center
            left++;
            right--;
        }
        // If no mismatch found, return true
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("The word \"" + word + "\" is " + (isPalindrome() ? "a Palindrome" : "not a Palindrome"));
    }
}
