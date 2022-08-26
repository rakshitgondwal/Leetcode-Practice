import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
     int [] nums = {0};
      moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int [] nums){
        int a = 0;
        int b = a+1;

        while(b< nums.length){
            if (nums[a] == 0 && nums[b] !=0){
                swap(a,b,nums);
                a++;
                b++;
                continue;
            }
            if (nums[a] == 0 && nums[b] ==0) {
                b++;
                continue;
            }
            if (nums[a] != 0 && nums[b] !=0) {
                a++;
                b++;
                continue;
            }
            if (nums[a] != 0 && nums[b] ==0){
                a++;
                b++;
                continue;
            }
        }
    }
    public static void swap(int a,int b, int[]nums){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }

