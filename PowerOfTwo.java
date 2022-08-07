public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n){
        if (n ==1){
            return true;
        }
        if (n%2 != 0){
            return false;
        }
         while (n>0){


             if ( isPowerOfTwo(n/2) == false){
                 return false;
             } else  return true;

         }
        return false;
    }
}
