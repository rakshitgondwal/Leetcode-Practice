import java.util.ArrayList;
import java.util.List;

public class CountGoodNumbers {
    public static void main(String[] args) {
        long n = 806166225460393l;
        System.out.println(goodNumbers(n));
    }
    public static int goodNumbers(long n){
        List<Integer> ansList = new ArrayList<>();
        helper(n,ansList);

        long ans = factorial(ansList);
        int sol = (int)ans;

        return sol;
    }
    public static void helper (long n, List<Integer> ans){
        for (int i = 0; i < n; i++) {
            if (i%2 ==0){
                ans.add(5);
            } else {
                ans.add(4);
            }
        } return;
    }
    public static long factorial(List<Integer> find){
        long M = 1000000007;

        long f = 1;
        for (int i = 0; i < find.size(); i++)
            f = (f* find.get(i)) % M;  // Now f never can
        // exceed 10^9+7
        return f;
    }
}
