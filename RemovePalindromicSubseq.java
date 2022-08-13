public class RemovePalindromicSubseq{
    public static void main(String[] args) {
       String s = "baabb";
        System.out.println(removePalindromeSub(s));
    }
    public static int removePalindromeSub(String s){
        if (s.length() == 0){
            return 0;
        }

        int l = 0;
        int r = s.length()-1;

        while (l<r){
            if (s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            } else return 2;
        } return 1;
    }
}
