public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }
    public static boolean isPowerOfFour(int n){
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;
        else return isPowerOfFour(n / 4);



  // The below one is less optimized.
//        if (n ==1){
//            return true;
//        }
//        if (n%4 != 0){
//            return false;
//        }
//        while (n>0){
//            if ( isPowerOfFour(n/4) == false){
//                return false;
//            } else  return true;
//        }
//        return false;
    }
}
