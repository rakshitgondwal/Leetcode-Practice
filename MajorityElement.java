public class MajorityElement {
    public static void main(String[] args) {
     int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int [] nums){
        int count = 0;
        int element = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count ==0){
                element = nums[i];
            }
            if (element == nums[i]){
                count++;
            }
            if (element != nums[i]){
                count--;
            }
        } return element;
    }
}
