import java.util.Arrays;

public class MinSumOf4DigitNo {
    public static void main(String[] args) {
        int num = 4932;
        System.out.println(ans(num));
    }

    public static int ans(int num){
        int arr [] = arr(num);
        int new1 = (arr[0]*10) + arr[2];
        int new2 = (arr[1]*10) + arr[3];

        int anssum = new1 + new2;
        return anssum;
    }
    public static int [] arr (int number){
        int [] arr = new int[4];
        arr[0] = number/1000;
        arr[1] = number/100 - (arr[0]*10);
        arr[2] = number/10 - (arr[1]*10) - (arr[0]*100);
        arr[3] = number/1 - (arr[2]*10) - (arr[1]*100) - (arr[0]*1000);

        Arrays.sort(arr);

        return arr;
    }

}
