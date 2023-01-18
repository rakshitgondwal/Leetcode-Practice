public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int s = n;
        int f = n;

        do{
            s = findSquare(s);
            f = findSquare(findSquare(f));

        }while(s!=f);

        if(s == 1){
            return true;
        }
        return false;
    }
    public static int findSquare(int n){
        int ans = 0;
        while(n >0){
            int rem= n % 10;
            ans += rem*rem;
            n = n/10;
        }
        return ans;
    }
}
