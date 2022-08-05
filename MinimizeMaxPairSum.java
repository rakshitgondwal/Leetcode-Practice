import java.util.Arrays;

public class MinimizeMaxPairSum {
    public static void main(String[] args) {
        int [] nums = {2,3,3,4};
        System.out.println(minPairSum(nums));
    }
    public static int minPairSum(int [] nums){

        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < nums.length/2; i++) {
            int pairSum = nums[i] + nums[nums.length-1-i];
            result = Math.max(result,pairSum);
        }

         return result;
    }


}
