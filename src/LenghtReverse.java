import java.util.Arrays;

public class LenghtReverse {
    // To reverse an array of strings data
    public static void main(String[] args){
        String[] array = {"Hello","Data", "Science"};
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static String[] reverse(String[] words){
        String[] reversedWord = new String[words.length];
        for (int i=0;i< words.length;i++){
            if(words[i].length()%2==0){
                //even, reverse
                reversedWord[i] = new StringBuilder(words[i]).reverse().toString();

            }
            else {
               reversedWord[i] = words[i].toUpperCase();
            }
        }
        return reversedWord;
    }
}
