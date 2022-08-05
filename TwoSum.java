import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
      int[] nums = {3,2,4};
        int [] answer = twoSum(nums,6);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] twoSum(int[] nums, int target){
        int [] ans = new int[2];

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {

                if(nums[i]  == target - nums[j]){
                    ans[0] = j;
                    ans[1] = i;
                    return ans;
                 }
            }

        } return null;
    }
}
