import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums){
            Arrays.sort(nums);

            boolean ans = false;

            for (int i = 0; i < nums.length-1; i++) {

                if (nums.length == 1){
                    ans = false;
                    return ans;
                }

                if(i==0){
                    if (nums[i] == nums[i+1]){
                        ans = true;
                        return ans;
                    }
                }

                if (i!= 0 ){
                if (nums[i] == nums[i+1] || nums[i] == nums[i-1]){
                    ans = true;
                } else ans = false;
                }

            } return ans;

    }
}

