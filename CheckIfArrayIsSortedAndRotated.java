public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[]nums = {2,7,4,1,2,6,2};
        System.out.println(check(nums));
    }

    public static boolean check (int [] nums){
        int s= nums[0];
        int e = nums[nums.length-1];
        int counter = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (s<e){
                if (nums[i]<nums[i+1] || nums[i]==nums[i+1]){
                    continue;
                }
                if (nums[i]>nums[i+1]){
                    return false;
                }
            }
            if (s>e || s==e){
                if (nums[i]<nums[i+1] || nums[i]==nums[i+1]){
                    continue;
                }
                if (nums[i]>nums[i+1] && counter==1){
                    counter--;
                    continue;
                }
                if (nums[i]>nums[i+1] && counter==0){
                    return false;
                }
            }
        } return true;




//        int count = 1;
//        int i = 0;
//        if (nums[0]<nums[nums.length-1]){
//            return false;
//        }
//        while(nums[0]>nums[nums.length-1] && i< nums.length-1){
//            if (nums[i] < nums[i+1]){
//                i++;
//                continue;
//            }
//            if (nums[i] > nums[i+1] && count==1){
//                i++;
//                count--;
//                continue;
//            }
//            if (nums[i]>nums[i+1]){
//                return false;
//            }
//        }
//       return true;
    }
}
