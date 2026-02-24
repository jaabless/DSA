public class Palindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("aaa"));
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
