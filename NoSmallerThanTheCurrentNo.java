import java.util.Arrays;

public class NoSmallerThanTheCurrentNo {
    public static void main(String[] args) {
       int [] nums = {8,1,2,2,3};
       int [] ansarr = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ansarr));
    }

    public static int [] smallerNumbersThanCurrent(int [] nums){

        int [] sortnums = nums;
        int [] ansarr = new int[nums.length];

        for (int i = 0; i < nums.length -1; i++) {
            ansarr[i] = bs(sortnums,nums[i]);
        }
        return ansarr;
    }

    public static int bs(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target){
                start = mid+1;
            } else {
                return mid;
            }

        } return -1;


    }

}
