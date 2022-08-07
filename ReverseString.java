import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
     char[] s = {'H','a','n','n','a','h'};
        reverseString(s);

    }

    public static void reverseString(char[] s){
       int start= 0;
       int end = s.length-1;

        for (start = 0; start < s.length/2; start++) {

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
        }
        System.out.println(Arrays.toString(s));

    }



}
