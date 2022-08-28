import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int [] rearrangeArray(int[]nums){
        int [] out = new int [nums.length];
        int j = 0;
        int k = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                out[j] = nums[i];
                j += 2;
            }else {
                out[k] = nums[i];
                k += 2;
            }
        }
        return out;
    }
//    public static int[] rearrangeArray(int[]nums){
//        List<Integer> negative = new ArrayList<>();
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0){
//                positive.add(nums[i]);
//            }else negative.add(nums[i]);
//        }
//
//        for (int i = 0; i < nums.length/2; i++) {
//            ans.add(positive.get(i));
//            ans.add(negative.get(i));
//        }
//        int[] res = new int[ans.size()];
//
//        for (int i = 0; i < ans.size(); i++) {
//            res[i] = ans.get(i);
//        }
//        return res;
//    }

}
