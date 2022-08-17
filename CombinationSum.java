import java.util.ArrayList;
import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);

        return result;
    }

    private static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start) {
        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }//for
        }//if
        else if (target == 0) {
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }
}
//    public static List<List<Integer>> combinationSum(int [] candidates , int target){
//        List<List<Integer>> ans = new ArrayList<>();
//
//        List<Integer> inAns = new ArrayList<>();
//        findAns(ans,inAns,candidates,target);
//        return ans;
//    }
//
//    public static void findAns(List<List<Integer>> ans , List<Integer> inAns,int [] arr, int target){
//        if (target ==0 ){
//            ans.add(inAns);
//            return;
//        }
//
//        for (int i = 0; i < arr.length && arr[i]<=target; i++) {
//            inAns.add(arr[i]);
//            findAns(ans,inAns,arr,target-arr[i]);
//            inAns.remove(inAns.size()-1);
//        }
//    }
//
//}
