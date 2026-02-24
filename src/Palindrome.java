public class Palindrome {

    public static void main(String[] args){
        System.out.println("Using string builder" + isPalindrome("abca"));
        System.out.println("Using array " + isPalindromeWithArray("aba"));
    }

    //A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).
    // To check if a string is a palindrome, we can reverse the string and compare it to the original string.
    // If they are the same, then the string is a palindrome.
    public static boolean isPalindrome(String str) {
        //Using StringBuilder to reverse the string and compare it with the original string
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);

    }

    public static boolean isPalindromeWithArray(String str) {
        //Using a character array to reverse the string and compare it with the original string
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }
        String reversed = new String(chars);
        return str.equals(reversed);
    }
}
