import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1};
        int target = 1;
        int [] finalarr = ans(nums,target);

        System.out.println(Arrays.toString(finalarr));
    }

    public static int [] ans (int [] nums, int target){
        if (nums.length == 1){
            if (nums[0] == target){
                int[] ans = {0,0};
                return ans;
            } else {
                int[] ans = {-1,-1};
                return ans;
            }
        }
        int firstnum = firstOccurence(nums,target);
        int secondnum = secondOccurence(nums,target,firstnum);



        if (firstnum> secondnum){
            int temp = firstnum;
            firstnum = secondnum;
            secondnum = temp;
        }
        int [] ansarr = {firstnum,secondnum};


        return ansarr;
    }

    public static int firstOccurence (int [] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while (start<end){

            int mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                end = mid ;
            } else {
                start = mid +1;
            }


        } return -1;
    }

    public static int secondOccurence (int [] nums , int target,int firstnum) {
        if (firstnum != -1) {
            if (nums[firstnum - 1] == target) {
                return firstnum - 1;
            }
            if (nums[firstnum + 1] == target) {
                return firstnum + 1;
            }

        }return firstnum;
    }

}

































//    public static void main(String[] args) {
//     int[] nums = {1,2,3,4,4,4,4,5,6};
//     int target = 4;
//        System.out.println(searchRange(nums,target));
//    }
//    public static int[] searchRange(int [] nums , int target){
//        int[] ans = new int[2];
//        ans[0]= findFirstOccurrence(nums,target);
//        ans[1]= findLastOccurrence(nums,target);
//
//        return ans;
//    }
//    private static int findFirstOccurrence(int[] nums, int target) {
//        // Left and right pointers
//        int left = 0;
//        int right = nums.length - 1;
//
//        int firstOccurrence = -1;
//
//        while (left <= right) {
//
//            int middle = left + (right - left) / 2;
//
//            if (nums[middle] == target) {
//                firstOccurrence = middle;
//                right = middle - 1;
//            }
//
//            else if (target < nums[middle]) {
//                right = middle - 1;
//            }
//
//            else {
//                left = middle + 1;
//            }
//        }
//        return firstOccurrence;
//    }
//
//    private static int findLastOccurrence(int[] nums, int target) {
//
//        int left = 0;
//        int right = nums.length - 1;
//
//        int lastOccurrence = -1;
//
//        while (left <= right) {
//
//            int middle = left + (right - left) / 2;
//
//            if (nums[middle] == target) {
//                lastOccurrence = middle;
//                left = middle + 1;
//            }
//
//            else if (target < nums[middle]) {
//                right = middle - 1;
//            }
//            else {
//                left = middle + 1;
//            }
//        }
//        return lastOccurrence;
//    }
//    }

