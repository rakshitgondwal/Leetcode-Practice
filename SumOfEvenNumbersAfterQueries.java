import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums,queries)));
    }
    public static int[]sumEvenAfterQueries(int [] A, int [][]queries){
        int sumEven = 0;
        int[] ret = new int[queries.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sumEven += A[i];
            }
        }

        //queries
        for (int i = 0; i < queries.length; i++) {
            int prev = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            // case 1: prev was even, now again it is even
            if (prev % 2 == 0 && A[queries[i][1]] % 2 == 0) {
                sumEven -= prev;
                sumEven +=  A[queries[i][1]];
            }
            // case 2: prev was even, now odd
            else if (prev % 2 == 0 && A[queries[i][1]] % 2 != 0) {
                sumEven -= prev;
            }
            // case 3: prev odd, now even
            else if (prev % 2 != 0 && A[queries[i][1]] % 2 == 0) {
                sumEven += A[queries[i][1]];
            }
            // case 4: prev odd, now odd

            ret[i] = sumEven;
        }
        return ret;
    }
}
