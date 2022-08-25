import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
     int [] nums = {0};
      moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i!=0){
                if (nums[i-1]==0){
                    swap(i-1,nums,i, nums.length-1-i);
                }
            }
            if (nums[i] == 0){
                swap(i,nums,i+1, nums.length-1-i);
            }
        }
    }
    public static void swap(int a,int[]nums,int b, int times){
        while (times!=0){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b++;
            times--;
        }
    }

}
