import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        String [] a = {"amazon","apple","facebook","google","leetcode"};
        String [] b = {"l","e"};
        System.out.println(wordSubsets(a,b));
    }
    public static List<String> wordSubsets(String[] words1 , String[] words2){

        List<String> result = new ArrayList<>();

        int[] b_max_freq = new int[26];

        for (int i = 0; i < words2.length; i++) {
            String currword = words2[i];
            int []char_count = count(currword);

            for (int j = 0; j < 26; j++) {
                b_max_freq[j] = Math.max(b_max_freq[j],char_count[j] );
            }
        }

        for (int i = 0; i < words1.length; i++) {
            String curr_word = words1[i];
            int [] currfreq = count(curr_word);

            boolean added = true;
            for (int j = 0; j < 26; j++) {
                if (b_max_freq[j] > currfreq[j]){
                    added = false;
                    break;
                }
            }
            if (added == true){
                result.add(curr_word);
            }
        }
        return result;
    }

    public static int[] count(String S){

        int [] count = new int[26];
        for (char b : S.toCharArray()){
          count[b -'a']++;
        }
     return count;
    }

}
