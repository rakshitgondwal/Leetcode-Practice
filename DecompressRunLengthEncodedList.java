import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompress(nums)));
    }
    public static int [] decompress(int [] nums){
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length ; i+=2) {
            int noOfTimes = nums[i];
            int toBeAdded = nums[i+1];
            int counter = 0;

            while(counter < noOfTimes){
                ans.add(toBeAdded);
                counter++;
            }
        }
         int [] ansArr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansArr[i] = ans.get(i);
        }

        return ansArr;
    }
}
