import java.util.ArrayList;

public class kThFactorOfN {
    public static void main(String[] args) {
    int n = 12;
    int k = 3;

        System.out.println(kthFactor(n,k));
    }
    public static int kthFactor(int n, int k){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0){
                list.add(i);
            }
        }
        if (list.size() < k){
            return -1;
        }

        return list.get(k-1);
    }

}
