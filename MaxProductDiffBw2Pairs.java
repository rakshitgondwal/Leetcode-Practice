import java.util.Arrays;

public class MaxProductDiffBw2Pairs {
    public static void main(String[] args) {
     int[] nums = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums){
        Arrays.sort(nums);
        int pd = (nums[nums.length-1] * nums[nums.length-2]) - (nums[0]*nums[1]);
        return pd;
    }

}
