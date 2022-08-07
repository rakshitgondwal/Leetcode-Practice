public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(15));
    }
    public static boolean isPowerOfThree(int n){

                return ( n>0 &&  1162261467%n==0);
            // Here, the largest value int can have is 2147483647
        // 3^19 = 1162261467 && 3^20 = 3486784401
        // Thus we modulo 3^19 with 3.
        // not really a interview type solution as you won't be able to calculate the
        // largest value 3^something can have, you will have to calculate that using loops.
        // If you will be using loops then the solution below is a better ans.


//        if (n == 0) return false;
//        if (n == 1) return true;
//        if (n % 3 != 0) return false;
//        else return isPowerOfThree(n / 3);



        // Brute force solution
//        if (n ==1){
//            return true;
//        }
//        if (n%3 != 0){
//            return false;
//        }
//        while (n>0){
//            if ( isPowerOfThree(n/3) == false){
//                return false;
//            } else  return true;
//        }
//        return false;
    }
}
