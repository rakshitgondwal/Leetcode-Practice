public class SubTheProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtract(4421));
    }
    public static int subtract(int n){
        int sum = 0;
        int product = 1;
        while (n!=0){
            product *= n%10;
            sum += n%10;
            n = n/10;
        }
        return product-sum;
    }
}
