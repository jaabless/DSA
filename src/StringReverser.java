public class StringReverser {

    /**
     * Reverses a string and returns the reversed result
     * @param str the string to reverse
     * @return the reversed string
     */
    public String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Reverses a string using a character array approach
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverseStringWithArray(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    /**
     * Reverses a string using recursion
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverseStringRecursive(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String testString = "dbaca";

        System.out.println("Original String: " + testString);
        System.out.println();

        System.out.println("Method 1 - Using StringBuilder:");
        StringReverser reverser = new StringReverser();
        System.out.println("Reversed: " + reverser.reverseString(testString));
        System.out.println();

        System.out.println("Method 2 - Using Character Array:");
        System.out.println("Reversed: " + reverseStringWithArray(testString));
        System.out.println();

        System.out.println("Method 3 - Using Recursion:");
        System.out.println("Reversed: " + reverseStringRecursive(testString));
    }
}

