import java.util.Arrays;

public class NandItsDoubleDigit {
    public static void main(String[] args) {
            int [] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == (2*arr[i])){
                    return true;
                }
                if (arr[i] == (2*arr[j])){
                    return true;
                }
            }

        }



         return false;
    }
}
