import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int [] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i] + n *(nums[nums[i]] % n);
        }
        for(int i=0;i<n;i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}








//THE SOLUTION BELOW TAKES EXTRA SPACE, WE HAVE TO SOLVE THIS QUESTION USING O(1)
//SPACE COMPLEXITY. THUS THE SOLUTION ABOVE IS MORE OPTIMIZED THAN THE BELOW ONE.



//public class BuildArrayFromPermutation {
//    public static void main(String[] args) {
//     int [] nums = {0,2,1,5,3,4};
//        System.out.println(Arrays.toString(buildArray(nums)));
//    }
//    public static int [] buildArray(int [] nums){
//        int [] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
//    }
//}
