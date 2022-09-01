public class TwoStringArraysAreEq {
    public static void main(String[] args) {
      String [] word1 = {"a","c"};
      String [] word2 = {"a","bc"};
        System.out.println(arrayStringEq(word1,word2));
    }
    public static boolean arrayStringEq(String [] word1, String[] word2){
        String first = "";
        for (int i = 0; i < word1.length; i++) {
           first =  first.concat(word1[i]);
        }

        String second = "";
        for (int i = 0; i < word2.length; i++) {
            second = second.concat(word2[i]);
        }

        if (first.equals(second)){
            return true;
        }else return false;
    }
}
