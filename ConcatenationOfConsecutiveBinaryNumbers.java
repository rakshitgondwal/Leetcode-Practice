public class ConcatenationOfConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        System.out.println(concatenateBinary(3));
    }
    public static int concatenateBinary(int n){
        String binary = "";
        for (int i = 1; i <= n; i++) {
            binary = binary + Integer.toBinaryString(i);
        }

        int ans = Integer.parseInt(binary,2);
        return ans%1000000007;
    }
}
