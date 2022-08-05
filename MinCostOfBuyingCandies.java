import java.util.Arrays;

public class MinCostOfBuyingCandies {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(minimumCost(arr));
    }
    public static int minimumCost(int[] A){

        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i)
            if (i % 3 != n % 3)
                res += A[i];
        return res;

    }
}
