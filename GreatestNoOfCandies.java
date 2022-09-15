import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNoOfCandies {
    public static void main(String[] args) {
        int[]candies = {2,3,5,1,3};
        System.out.println((kidsWithCandies(candies,3)));
    }
    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies){
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i],max);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies>= max){
                ans.add(true);
            }else ans.add(false);
        }
        return ans;
    }
}
