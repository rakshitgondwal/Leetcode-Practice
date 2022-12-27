import java.util.Arrays;

public class FindAPeakElement2 {
    public static void main(String[] args) {
        int [][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakFrid(matrix)));
    }
    public static int[] findPeakFrid(int [][] matrix){
        int n = matrix.length, m = matrix[0].length, lo = 0, hi = m - 1, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int max_row = 0;
            for (int i = 0; i < n; ++i) {
                if (matrix[max_row][mid] < matrix[i][mid])
                    max_row = i;
            }
            if ((mid == 0 || matrix[max_row][mid] > matrix[max_row][mid - 1]) &&
                    (mid == m - 1 || matrix[max_row][mid] > matrix[max_row][mid + 1]))
                return new int[] {max_row, mid};
            else if (mid > 0 && matrix[max_row][mid - 1] > matrix[max_row][mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return new int[] {-1, -1};
    }
}
