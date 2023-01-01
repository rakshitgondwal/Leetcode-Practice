public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int [] nums= {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int []nums, int threshold){
        int ans = -1;

        int low = 1;
        int high = nums[0];
        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = findDivisionSum(nums, mid);
            if (result <= threshold) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
    private static int findDivisionSum(int[] nums, int divisor) {
        int result = 0;
        for (int num : nums) {
            result += Math.ceil((1.0 * num) / divisor);
        }
        return result;
    }
}
