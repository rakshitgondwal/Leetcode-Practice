import java.util.ArrayList;
import java.util.List;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
    public static int numTilePossibilities(String tiles){
        int arr[] = new int[26];
        for(char c : tiles.toCharArray())   arr[c - 'A']++;
        return sequences(arr);
    }
    private static int sequences(int[] arr){
        int sum = 0;
        for(int i=0; i<26; i++){
            if(arr[i] == 0) continue;
            sum++;
            arr[i]--;
            sum += sequences(arr);
            arr[i]++;
        }
        return sum;
    }

}
