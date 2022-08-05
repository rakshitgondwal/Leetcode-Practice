import java.util.Arrays;

public class MaxNoOfCoins {
    public static void main(String[] args) {
        int [] piles = {2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }

    public static int maxCoins(int[] piles){
        Arrays.sort(piles);

        int res = 0;

        for (int i = piles.length/3; i < piles.length; i+=2) {
            res += piles[i];
        }

        return res;
    }

}
