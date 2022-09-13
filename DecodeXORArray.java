import java.util.Arrays;

public class DecodeXORArray {
    public static void main(String[] args) {
        int [] encoded = {6,2,7,3};
        int first = 4;
        System.out.println(Arrays.toString(decoded(encoded,first)));
    }
    public static int [] decoded(int [] encoded , int first){
        int[] ans = new int[encoded.length+1];
        ans[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            ans[i+1]= ans[i]^encoded[i];
        }
        return ans;
    }
}
