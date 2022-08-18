import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int n = 3;
        int [] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int [] shuffle(int [] nums, int n){
        int[] res = new int[2*n];
        for(int i = 0; i < n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n+i];
        }
        return res;
    }
}
