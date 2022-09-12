import java.util.Arrays;

public class BagOfTokens {
    public static void main(String[] args) {
        int [] tokens = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokens(tokens,power));
    }
    public static int bagOfTokens(int [] tokens, int power){
        Arrays.sort(tokens);

        int maxScore = 0;
        int score = 0;
        int i =0;
        int j = tokens.length-1;

        while(i<=j){
            if (power >= tokens[i]){
                score+=1;
                maxScore = Math.max(maxScore,score);

                power-=tokens[i];
                i++;
            } else if (score > 0) {
                score--;
                power+=tokens[j];
                j--;
            } else return maxScore;
        }
        return maxScore;
    }
}
