import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        int [] nums = {5,1,6};
        System.out.println(subsetXORSum(nums));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                         BACKTRACKING SOLTUION                                                        //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int subsetXORSum(int[] nums) {
        int[] sum = new int[1];
        dfs(nums, 0, new ArrayList<>(), sum);
        return sum[0];
    }

    static void dfs(int[] nums, int current, List<Integer> ls, int[] sum) {
        int temp = 0;
        for (int num: ls)
            temp ^= num;
        sum[0] += temp;

        for (int i = current; i < nums.length; i++) {
            ls.add(nums[i]);
            dfs(nums, i + 1, ls, sum);
            ls.remove(ls.size() - 1);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                         RECURSIVE SOLTUION                                                        //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//    public static int susbsetXORSum(int[]nums){
//        return helper(nums,0,0);
//    }
//
//    public static int helper(int[]nums,int index, int xor){
//        if (index == nums.length){
//            return xor;
//        }
//        int taken = helper(nums,index+1,xor ^ nums[index]);
//        int notTaken = helper(nums,index+1,xor);
//
//        return taken+notTaken;
//    }
}
