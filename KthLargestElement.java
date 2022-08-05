import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
     int [] nums = {3,2,3,1,2,4,5,5,6};
     int k =4;
        System.out.println(kThLargestElemnt(nums,k));
    }
    public static int kThLargestElemnt(int[] nums , int k){
        Arrays.sort(nums);
        return nums[nums.length - k] ;
    }
}

