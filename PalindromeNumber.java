public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalidrome(-121));
    }
    public static boolean isPalidrome(int x){
        String nums = String.valueOf(x);
        int right = nums.length()-1;
        boolean ans = true;
        for (int i = 0; i < nums.length()/2; i++) {

            if (i == right){
                return true;
            }

            if (nums.charAt(i) != nums.charAt(right)){
              return false;
            }else {
                right--;
            }
        }
        return ans;
    }
}
