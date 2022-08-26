import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
     int [] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsOnes(nums));
    }
    public static int findMaxConsOnes(int [] nums){
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else count = 0;
        }

        return result;
    }
}
