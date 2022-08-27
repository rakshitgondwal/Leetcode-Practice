import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int[] answer = twoSum(nums, 10);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[]nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = i+1;

        while (i< nums.length){
            if (nums[i] + nums[j] == target){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if (j== nums.length-1){
                i++;
                j=i+1;
            }else j++;
        }
       return ans;
    }
}
//    public static int[] twoSum(int[] nums, int target){
//        int [] ans = new int[2];
//
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//
//                if(nums[i]  == target - nums[j]){
//                    ans[0] = j;
//                    ans[1] = i;
//                    return ans;
//                 }
//            }
//
//        } return null;
//    }
//}
