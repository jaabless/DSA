import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AlphabeticallySmallest {
    //To find the alphabetically smallest

    public static void main(String[] args){
        System.out.println(reversal("dbaca"));
    }

    public static  String reversal(String words){
//        String firstReversal ="";
//        String lastReversal = "";
        String smallest =words;
        for (int k =1;k<=words.length(); k++){
            String wordBefore = words.substring(0,k);
            String wordEnding = words.substring(k);
            String firstReversal = new StringBuilder(wordBefore).reverse().toString() + wordEnding;
            String lastReversal = words.substring(0,words.length()-k) + new StringBuilder(words.substring(words.length()-k)).reverse();
            smallest = Collections.min(Arrays.asList(smallest,firstReversal,lastReversal));
        }
        return smallest;

    }
}
